package org.semnome;

import org.semnome.db.DB;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        Connection connection = DB.getConnection();
        DB.closeConnection();
    }
}