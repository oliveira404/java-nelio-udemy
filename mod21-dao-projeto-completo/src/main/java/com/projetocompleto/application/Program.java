package com.projetocompleto.application;

import com.projetocompleto.model.DAO.DaoFactory;
import com.projetocompleto.model.DAO.SellerDao;
import com.projetocompleto.model.entities.Seller;

public class Program {

    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

    }
}