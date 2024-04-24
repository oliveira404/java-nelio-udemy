/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author igor
 */
public class ex04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new  Scanner(System.in);
        int acumuladorDePares = 0;
        
        System.out.print("Quantos números você vai digitar ? ");
        int[] conjuntoNumeros = new int[entrada.nextInt()];
        
        for(int i = 0; i < conjuntoNumeros.length; i++){
            System.out.print("Digite um número: ");
            conjuntoNumeros[i] = entrada.nextInt();
        }
        
        System.out.println("\nNUMEROS PARES:");
        for(int i = 0; i < conjuntoNumeros.length; i++){
            if(conjuntoNumeros[i] % 2 == 0){
                System.out.print(conjuntoNumeros[i] + "  ");
                acumuladorDePares++;
            }
        }
        
        System.out.println("\n\nQUANTIDADE DE PARES = " + acumuladorDePares);
        
        System.out.println("");
        
        
    }
    
}


/*
Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares.

*/