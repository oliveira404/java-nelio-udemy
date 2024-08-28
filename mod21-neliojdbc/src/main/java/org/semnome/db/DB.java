package org.semnome.db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {
    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                //Properties props = loadProperties();
                //String url = props.getProperty("dburl");
                String url = "jdbc:mariadb://localhost:3306/neliojdbc";
                String username = "root";
                String password = "0122";
                connection = DriverManager.getConnection(url, username, password);
                System.out.println("Connection Successfully!");
            } catch (SQLException | ClassNotFoundException e) {
                System.out.println("Connection cannot be conclude!");
                throw new DbException(e.getMessage());
            }
        }
        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Connection Closed!");
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    /*private static Properties loadProperties() {
        try (FileInputStream fs = new FileInputStream("java.org.semnome.dbproperties")) {
            Properties props = new Properties();
            props.load(fs);
            return props;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new DbException(e.getMessage());
        }
    }*/
}
