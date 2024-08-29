package com.projetocompleto.model.DAO.impl;

import com.projetocompleto.DB.DB;
import com.projetocompleto.DB.DbException;
import com.projetocompleto.model.DAO.DepartmentDao;
import com.projetocompleto.model.entities.Department;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDaoJDBC implements DepartmentDao {

    private Connection connection;

    public DepartmentDaoJDBC(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Department findById(Integer id) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = this.connection.prepareStatement("SELECT * FROM department WHERE department.id = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                Department department = new Department();
                department.setId(rs.getInt("Id"));
                department.setName(rs.getString("Name"));
                return department;
            }
            throw new DbException("Não existe um departamento de id: " + id);
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(ps);
            DB.closeResultSet(rs);
        }
    }

    @Override
    public List<Department> findAll() {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = this.connection.prepareStatement("SELECT * FROM department ORDER BY Name");
            rs = ps.executeQuery();

            List<Department> departmentList = new ArrayList<>();

            while (rs.next()) {
                Department department = new Department();
                department.setId(rs.getInt("Id"));
                department.setName(rs.getString("Name"));
                departmentList.add(department);
            }
            return departmentList;
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(ps);
            DB.closeResultSet(rs);
        }
    }

    @Override
    public void insert(Department obj) {
        PreparedStatement ps = null;
        try {
            ps = this.connection.prepareStatement("" +
                    "INSERT INTO department (name) VALUES (?)",
                    Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, obj.getName());

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) obj.setId(rs.getInt(1));
                DB.closeResultSet(rs);
            } else {
                throw new DbException("Unexpected error! No rows Affected!");
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(ps);
        }
    }

    @Override
    public void update(Department obj) {

    }

    @Override
    public void deleteById(Integer id) {

    }
}