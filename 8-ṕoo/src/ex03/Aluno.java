/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author igor
 */
public class Aluno {

    String nome;
    double nota1;
    double nota2;
    double nota3;

    public double calcularNotaFinal(double n1, double n2, double n3) {
        double totalNotas = n1 + n2 + n3;

        double totalFaltante = 60 - totalNotas;

        if (totalNotas > 60) {
            System.out.println("");
            System.out.println("Congrats!!!");
        } else {
            primeiroTrimestre(n1);
            segundoTrimestre(n2);
            terceiroTrimestre(n3);
           
            System.out.println("Reproved!!!");
            System.out.println("Missing: " + totalFaltante);
        }
        return totalNotas;
    }

    public double primeiroTrimestre(double n1) {
        double notaPendente;
        if (n1 >= 30) {
            return n1;
        }

        notaPendente = 30 - n1;
        System.out.println("");
        System.out.println("Reprovado no Primeiro Trimestre. Faltou: " + notaPendente);
        return notaPendente;
    }

    public double segundoTrimestre(double n2) {
        double notaPendente;
        if (n2 >= 35) {
            return n2;
        }

        notaPendente = 35 - n2;
        System.out.println("Reprovado no Segundo Trimestre. Faltou: " + notaPendente);
        return notaPendente;
    }

    public double terceiroTrimestre(double n3) {
        double notaPendente;
        if (n3 >= 35) {
            return n3;
        }

        notaPendente = 35 - n3;
        System.out.println("Reprovado no Terceiro Trimestre. Faltou: " + notaPendente);
        System.out.println("");
        return notaPendente;
    }

    @Override
    public String toString() {
        return "Nota Final: " + calcularNotaFinal(this.nota1, this.nota2, this.nota3);
    }

}


/*

Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano

(primeiro trimestre vale 30 e o 
segundo e terceiro valem 35 cada). 

Ao final, mostrar qual a nota final do aluno no
ano. 

Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
resolver este problema.
 */
