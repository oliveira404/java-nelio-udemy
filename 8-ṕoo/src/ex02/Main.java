/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex02;

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
        Empregado empregado = new Empregado();
        
        System.out.print("Nome: ");
        empregado.nome = entrada.nextLine();
        
        System.out.print("Salário Bruto: ");
        empregado.salarioBruto = entrada.nextDouble();
        
        System.out.print("Imposto: ");
        empregado.imposto = entrada.nextDouble();
        
        
        System.out.println("");
        System.out.println(empregado);
       
        
        
        
        System.out.print("Which percentage to increase salary? ");
        
        double porcentagem = entrada.nextDouble();
        
        empregado.aumentarSalario(porcentagem);
        
        System.out.println("");
        System.out.println(empregado);
        
        
        
        
    }
}
