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

        /*System.out.println("\n=== TEST 2: departament findByAll ===");
        List<Department> departmentList = departmentDao.findAll();
        departmentList.forEach(System.out::println);

        System.out.println("\n=== TEST 3: departament insert ===");
        department = new Department(null, "Construcao");
        departmentDao.insert(department);
        System.out.println("Inserted! New id " + department.getId());*/

        /*System.out.println("\n=== TEST 4: departament update ===");
        department = departmentDao.findById(3);
        department.setName("carlao");
        departmentDao.update(department);
        System.out.println("Updated completed! " + department.getId());*/

        System.out.println("\n=== TEST 5: departament delete ===");
        departmentDao.deleteById(12);
    }
}
