/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package membros;

import java.util.Locale;
import java.util.Scanner;
import staticc.Estatico;
import util.Calcula;

/**
 *
 * @author igor
 */
public class Membros2 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        //Calcula cal = new Calcula();
        
        //Estatico estatico = new Estatico();
        
        System.out.print("Enter with value of radius: ");
        double radius = entrada.nextDouble();
        
        //double c = Estatico.circumferencia(radius);
        
        //double v = Estatico.volume(radius);
        
        //System.out.printf("circunference: %.2f%n", c);
        //System.out.printf("volume: %.2f%n", v);
        //System.out.printf("Pi value: %.2f%n", Estatico.PI);
        
        entrada.close();
    }
    
}
