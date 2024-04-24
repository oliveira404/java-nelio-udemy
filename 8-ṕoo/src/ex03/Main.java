/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex03;

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
        Aluno aluno1 = new Aluno();
        
        System.out.print("Nome do aluno : ");
        aluno1.nome = entrada.nextLine();
        
        System.out.println("");
        
        System.out.print("Primeira nota: ");
        double nota1 = entrada.nextDouble();
        
        System.out.print("Segunda nota: ");
        double nota2 = entrada.nextDouble();
        
        System.out.print("Terceira nota: ");
        double nota3 = entrada.nextDouble();     
        
        aluno1.nota1 = nota1;
        aluno1.nota2 = nota2;
        aluno1.nota3 = nota3;
        
        //aluno1.calcularNotaFinal(nota1, nota2, nota3);
        
        System.out.println(aluno1);
        
        
        
        entrada.close();
    }
    
}
