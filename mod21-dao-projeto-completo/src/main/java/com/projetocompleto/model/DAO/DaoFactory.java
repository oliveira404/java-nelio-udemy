package com.projetocompleto.model.DAO;

import com.projetocompleto.DB.DB;
import com.projetocompleto.model.DAO.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }
}