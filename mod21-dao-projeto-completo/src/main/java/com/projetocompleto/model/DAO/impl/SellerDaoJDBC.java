package com.projetocompleto.model.DAO.impl;

import com.projetocompleto.DB.DB;
import com.projetocompleto.DB.DbException;
import com.projetocompleto.model.DAO.SellerDao;
import com.projetocompleto.model.entities.Department;
import com.projetocompleto.model.entities.Seller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SellerDaoJDBC implements SellerDao {

    private Connection conn;

    public SellerDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Seller obj) {

    }

    @Override
    public void update(Seller obj) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Seller findById(Integer id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = this.conn.prepareStatement("" +
                    "SELECT seller .*,department.Name as DepName " +
                    "FROM seller INNER JOIN department " +
                    "ON seller.DepartmentId = department.Id " +
                    "WHERE seller.Id = ?");

            st.setInt(1, id);
            rs = st.executeQuery();
            // se o codigo acima nao retornar nada ele vai pular o if e vai retornar false
            if (rs.next()) {
                Department department = instanciateDepartment(rs);
                Seller seller = instanciateSeller(rs, department);
                return seller;
            }
            return null; //nao existia nenhum vendedor com esse id
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
            //DB.closeConnection(); Nao precisa fechar pq vamos usar outros metodos com
            // o mesmo DAO, isso se fecha no programa principal
        }

    }

    private Seller instanciateSeller(ResultSet rs, Department department) throws SQLException {
       Seller seller = new Seller();
       seller.setId(rs.getInt("Id"));
       seller.setName(rs.getString("Name"));
       seller.setEmail(rs.getString("Email"));
       seller.setBaseSalary(rs.getDouble("BaseSalary"));
       seller.setBirthDate(rs.getDate("BirthDate"));
       seller.setDepartment(department);
       return seller;
    }

    private Department instanciateDepartment(ResultSet rs) throws SQLException {
        Department department = new Department();
        department.setId(rs.getInt("DepartmentId"));
        department.setName(rs.getString("DepName"));
        return department;
    }


    @Override
    public List<Seller> findAll() {
        return List.of();
    }

    @Override
    public List<Seller> findByDepartment(Department department) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = this.conn.prepareStatement("" +
                    "SELECT seller.*,department.Name as DepName " +
                    "FROM seller " +
                    "INNER JOIN department " +
                    "ON seller.DepartmentId = department.Id " +
                    "WHERE DepartmentId = ? ORDER BY Name"
            );

            st.setInt(1, department.getId());
            rs = st.executeQuery();

            List<Seller> sellerList = new ArrayList<>();
            Map<Integer, Department> map = new HashMap<>();

            //map para nao ficarmos repetindo a criação de novos departmentos para cada seller,
            //queremos que um seller esteja no mesmo departmento

            while (rs.next()) {
                Department dep = map.get(rs.getInt("DepartmentId"));

                if (dep == null) {
                    dep = instanciateDepartment(rs);
                    map.put(rs.getInt("DepartmentId"), dep);
                }
                Seller seller = instanciateSeller(rs, dep);
                sellerList.add(seller);
            }
            return sellerList;
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }

    }
}
