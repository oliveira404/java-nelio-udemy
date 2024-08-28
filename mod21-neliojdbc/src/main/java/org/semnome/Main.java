package org.semnome;

import org.semnome.db.DB;

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
            st = conn.prepareStatement("UPDATE seller " +
                    "SET BaseSalary = BaseSalary + ? WHERE (DepartmentId = ?)");
            st.setDouble(1, 100.0);
            st.setInt(2, 5);

            int rowsAffected = st.executeUpdate();

            System.out.println("Done! Rows Affected: " + rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}