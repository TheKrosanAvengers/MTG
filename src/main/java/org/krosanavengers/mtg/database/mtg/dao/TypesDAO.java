package org.krosanavengers.mtg.database.mtg.dao;

import org.krosanavengers.mtg.database.mtg.dto.TypeDTO;

import java.sql.*;

public class TypesDAO {
    private static TypesDAO instance = null;


    public static TypesDAO getInstance() {
        if (instance == null) {
            instance = new TypesDAO();
        }
        return instance;
    }

    public void insert(Connection connection, TypeDTO type) throws SQLException {
        String sql = "";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setString(1, type.getName());
            preparedStatement.executeUpdate();
            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            if (generatedKeys.next()) {
                type.setId(generatedKeys.getInt(1));
            }
        }
    }
}
