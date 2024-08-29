package com.projetocompleto.application;

import com.projetocompleto.model.DAO.DaoFactory;
import com.projetocompleto.model.DAO.SellerDao;
import com.projetocompleto.model.entities.Seller;

public class Program {

    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

    }
}