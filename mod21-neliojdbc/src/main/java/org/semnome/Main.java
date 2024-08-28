package org.semnome;

import org.semnome.db.DB;
import org.semnome.db.DbIntegrityException;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement st = null;

        try {
            // para todos do departamento de codigo 2 vai setar um aumento de 100 reais a mais.
            conn = DB.getConnection();
            st = conn.prepareStatement("DELETE FROM department WHERE id = ?");
            st.setInt(1, 2); //o primeiro é o ? o segundo é a linha da coluna.

            int rowsAffected = st.executeUpdate();

            System.out.println("Done! Rows Affected: " + rowsAffected);
        } catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}