package org.krosanavengers.mtg.database;

import org.h2.tools.Server;
import org.krosanavengers.mtg.Constant;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseFactory {

    private static Connection h2Connection;
    private static Connection sqliteConnection;
    private static Server server = null;

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        try {
            server = Server.createTcpServer("-tcpAllowOthers", "-ifNotExists", "-baseDir", "./").start();
            Class.forName("org.h2.Driver");
            h2Connection = DriverManager.
                    getConnection(Constant.h2URL, "", "");
            System.out.println("Connection Established: "
                    + h2Connection.getMetaData().getDatabaseProductName() + "/" + h2Connection.getCatalog());
            sqliteConnection = DriverManager.getConnection(Constant.sqliteURL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static Connection getH2Connection() {
        return h2Connection;
    }

    public static Connection getSqliteConnection() {
        return sqliteConnection;
    }


    public static void stop() {
        if (server != null) {
            server.stop();
        }
    }
}
