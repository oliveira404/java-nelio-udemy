/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package membros;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author igor
 */
public class Membros {
    public static final double PI = 3.14159;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Enter with value of radius: ");
        double radius = entrada.nextDouble();
        
        double c = circumferencia(radius);
        
        double v = volume(radius);
        
        System.out.printf("circunference: %.2f%n", c);
        System.out.printf("volume: %.2f%n", v);
        System.out.printf("Pi value: %.2f%n", PI);
        
        entrada.close();
    }
    
    public static double circumferencia(double radius){
        return 2.0 * PI * radius;
    }
    
    public static double volume(double radius){
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
