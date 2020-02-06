import org.h2.tools.Server;

import java.sql.Connection;
import java.sql.DriverManager;

public class main {
    public static void main(String[] args) {
        Server server = null;
        try {
            server = Server.createTcpServer("-tcpAllowOthers", "-ifNotExists", "-baseDir", "./").start();
            Class.forName("org.h2.Driver");
            Connection conn = DriverManager.
                    getConnection("jdbc:h2:tcp://localhost/mtg", "sa", "");
            System.out.println("Connection Established: "
                    + conn.getMetaData().getDatabaseProductName() + "/" + conn.getCatalog());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
