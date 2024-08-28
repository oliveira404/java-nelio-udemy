package com.projetocompleto.application;

import com.projetocompleto.model.entities.Department;
import com.projetocompleto.model.entities.Seller;

import java.util.Date;

public class Program {

    public static void main(String[] args) {

        Department department = new Department(1, "books");
        Seller seller = new Seller(21, "bobo", "bobo@gmail", new Date(), 300.0, department);
        System.out.println(seller);
    }
}