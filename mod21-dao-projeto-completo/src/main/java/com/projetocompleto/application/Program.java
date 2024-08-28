package com.projetocompleto.application;

import com.projetocompleto.model.DAO.DaoFactory;
import com.projetocompleto.model.DAO.SellerDao;
import com.projetocompleto.model.DAO.impl.SellerDaoJDBC;
import com.projetocompleto.model.entities.Department;
import com.projetocompleto.model.entities.Seller;

import java.util.Date;

public class Program {

    public static void main(String[] args) {

        Department department = new Department(1, "books");
        Seller seller = new Seller(21, "bobo", "bobo@gmail", new Date(), 300.0, department);

        // Não vamos expor nossa implementação deste jeito.
        //SellerDao sellerDao = new SellerDaoJDBC();

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(seller);
    }
}