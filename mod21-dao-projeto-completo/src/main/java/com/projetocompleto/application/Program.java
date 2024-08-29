package com.projetocompleto.application;

import com.projetocompleto.model.DAO.DaoFactory;
import com.projetocompleto.model.DAO.SellerDao;
import com.projetocompleto.model.entities.Department;
import com.projetocompleto.model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        /*System.out.println("\n=== TEST 2: seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        list.forEach(System.out::println);

        System.out.println("\n=== TEST 3: seller findAll ===");
        list = sellerDao.findAll();
        list.forEach(System.out::println);

        System.out.println("\n=== TEST 4: seller insert ===");
        Seller seller1 = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(seller1);
        System.out.println("Inserted! New id " + seller1.getId());

        System.out.println("\n=== TEST 5: seller update ===");
        seller = sellerDao.findById(1);
        seller.setName("Lá vem o marcos");
        seller.setBaseSalary(10000.0);
        sellerDao.update(seller);
        System.out.println("Updated completed!");*/

        System.out.println("\n=== TEST 5: seller delete ===");
        sellerDao.deleteById(24);
    }
}