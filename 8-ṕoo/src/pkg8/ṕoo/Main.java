/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8.ṕoo;

import Entity.Product;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author igor
 */
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        
        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = entrada.nextLine();
        
        System.out.print("Price: ");
        product.price = entrada.nextDouble();
        
        System.out.print("Quantity in stock: ");
        product.quantity = entrada.nextInt();
        
        
        System.out.println("");
        System.out.println("Product Data: " + product);
        
        System.out.println("");
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = entrada.nextInt();
        product.addProduct(quantity);
        
        System.out.println("");
        System.out.println("Updated Data: " + product);
        
        //saida
        System.out.println("");
        System.out.println("Enter the number of products to be removed in stock: ");
        quantity = entrada.nextInt();
        product.removeProduct(quantity);
        
        System.out.println("");
        System.out.println("Updated Data: " + product);
        
        entrada.close();
    }
    
}
