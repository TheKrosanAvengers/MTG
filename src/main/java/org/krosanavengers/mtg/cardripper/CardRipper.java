package org.krosanavengers.mtg.cardripper;

import org.apache.commons.lang3.StringUtils;
import org.krosanavengers.mtg.database.DatabaseFactory;
import org.krosanavengers.mtg.database.mtg.dto.CardDTO;
import org.krosanavengers.mtg.database.mtg.dto.TypeDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CardRipper {

    public static void main(String[] args) {
        DatabaseFactory.start();

        try (Connection sqliteConnection = DatabaseFactory.getSqliteConnection()) {
            try (Connection h2Connection = DatabaseFactory.getH2Connection()) {

                String fromSqlite = "select max(multiverseId) multiverseId,\n" +
                        "       name,\n" +
                        "       convertedManaCost,\n" +
                        "       manaCost,\n" +
                        "       colorIdentity,\n" +
                        "       supertypes,\n" +
                        "       types,\n" +
                        "       subtypes,\n" +
                        "       text,\n" +
                        "       power,\n" +
                        "       toughness\n" +
                        "from cards\n" +
                        "inner join legalities on cards.uuid = legalities.uuid\n" +
                        "where multiverseId IS NOT NULL and multiverseId > ?\n" +
                        "group by  name,\n" +
                        "          convertedManaCost,\n" +
                        "          manaCost,\n" +
                        "          colorIdentity,\n" +
                        "          supertypes,\n" +
                        "          types,\n" +
                        "          subtypes,\n" +
                        "          text,\n" +
                        "          power,\n" +
                        "          toughness\n" +
                        "order by multiverseId\n" +
                        "limit 1000\n" +
                        "\n" +
                        "\n";

                int count = 0;
                int minId = 0;
                int batchSize = 1000;

                do {
                    PreparedStatement preparedStatement = sqliteConnection.prepareStatement(fromSqlite);
                    preparedStatement.setInt(1, minId);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    while (resultSet.next()) {
                        String manaCost = resultSet.getString("manaCost");
                        List<String> manaCostList = null;
                        if (!StringUtils.isBlank(manaCost)) {
                            manaCostList =
                                    Arrays.stream(manaCost.split("\\{")).filter(StringUtils::isBlank).map(s ->
                                            "{" + s).collect(Collectors.toList());
                        }

                        String colorIdentity = resultSet.getString("colorIdentity");
                        List<String> colorIdentityList = null;
                        if (!StringUtils.isBlank(colorIdentity)) {
                            colorIdentityList =
                                    Arrays.asList(colorIdentity.split(""));
                        }

                        String supertypes = resultSet.getString("supertypes");
                        List<TypeDTO> supertypesList = null;
                        if (!StringUtils.isBlank(supertypes)) {
                            supertypesList =
                                    Arrays.stream(supertypes.split(",")).filter(StringUtils::isBlank).map(TypeDTO::new).collect(Collectors.toList());
                        }

                        String types = resultSet.getString("types");
                        List<TypeDTO> typesList = null;
                        if (!StringUtils.isBlank(types)) {
                            typesList =
                                    Arrays.stream(types.split(",")).filter(StringUtils::isBlank).map(TypeDTO::new).collect(Collectors.toList());
                        }

                        String subtypes = resultSet.getString("subtypes");
                        List<TypeDTO> subtypesList = null;
                        if (!StringUtils.isBlank(subtypes)) {
                            subtypesList =
                                    Arrays.stream(subtypes.split(",")).filter(StringUtils::isBlank).map(TypeDTO::new).collect(Collectors.toList());
                        }

                        CardDTO cardDTO = new CardDTO(resultSet.getInt("multiverseId"),
                                resultSet.getString("name"),
                                resultSet.getInt("convertedManacost"),
                                manaCostList,
                                colorIdentityList,
                                resultSet.getString("power"),
                                resultSet.getString("toughness"),
                                supertypesList, typesList, subtypesList, new ArrayList<>());

                        cardDTO.toString();
                    }
                } while (count >= 0);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
