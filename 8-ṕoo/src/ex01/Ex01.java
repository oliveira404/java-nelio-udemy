/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author igor
 */
public class Ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();
        
        System.out.println("Enter rectangle width and height: ");
        retangulo.width = entrada.nextDouble();
        retangulo.height = entrada.nextDouble();
        
        System.out.println("Área: " + retangulo.area(retangulo.width, retangulo.height));
        System.out.println("Perímetro: " + retangulo.perimetro(retangulo.height, retangulo.height));
        System.out.println("Diagonal: " + retangulo.diagonal(retangulo.height, retangulo.height));
        
        
        
    }
}
