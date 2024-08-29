package com.projetocompleto.application;

import com.projetocompleto.model.DAO.DaoFactory;
import com.projetocompleto.model.DAO.DepartmentDao;
import com.projetocompleto.model.entities.Department;

public class Program2 {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: departament findById ===");
        Department department = departmentDao.findById(5);
        System.out.println(department);

        System.out.println("=== TEST 1: departament findById ===");
    }
}
