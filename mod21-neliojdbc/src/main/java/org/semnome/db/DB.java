package org.semnome.db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
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
                System.out.println("\u001B[92mConnection Successfully!\u001B[0m\n");
            } catch (SQLException | ClassNotFoundException e) {
                System.out.println("\u001B[91mConnection cannot be conclude!\u001B[0m\n");
                throw new DbException(e.getMessage());
            }
        }
        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("\n\u001B[93mConnection Closed!\u001B[0m");
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    public static void closeStatement(Statement statement) {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    public static void closeResultSet(ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
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
