package org.semnome;

import org.semnome.db.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        //Connection connection = DB.getConnection();
        //DB.closeConnection();

        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = DB.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM department");

            // enquanto existir uma proxima linha
            while (rs.next()) {
                System.out.println(rs.getInt("id") + ", " + rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            // fizemos assim para nao ficarmos criando vários try catch aqui.
            // estamos fechando pois a jvm não conrola essas conexões, então para evitar consuma fechamos elas
            DB.closeResultSet(rs);
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}