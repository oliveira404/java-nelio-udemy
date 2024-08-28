package com.projetocompleto.model.DAO;

import com.projetocompleto.model.DAO.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC();
    }
}