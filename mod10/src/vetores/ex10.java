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
public class ex10 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        int quantidadeEscolhaUsuario;
        String conjuntoNomes[];
        double conjuntoPrimeiraNota[];
        double conjuntoSegundaNota[];
        double media;

        System.out.print("Quantos alunos serão digitados? ");
        quantidadeEscolhaUsuario = entrada.nextInt();
        conjuntoNomes = new String[quantidadeEscolhaUsuario];
        conjuntoPrimeiraNota = new double[quantidadeEscolhaUsuario];
        conjuntoSegundaNota = new double[quantidadeEscolhaUsuario];

        for (int i = 0; i < quantidadeEscolhaUsuario; i++) {
            System.out.print((i + 1) + "° Aluno");
            System.out.println("");

            entrada.nextLine();

            System.out.print("Nome: ");
            conjuntoNomes[i] = entrada.nextLine();

            System.out.print("Primeira Nota: ");
            conjuntoPrimeiraNota[i] = entrada.nextDouble();

            System.out.print("Segunda Nota: ");
            conjuntoSegundaNota[i] = entrada.nextDouble();

        }

        System.out.println("\nAlunos Aprovados");

        for (int i = 0; i < quantidadeEscolhaUsuario; i++) {
            media = (conjuntoPrimeiraNota[i] + conjuntoSegundaNota[i]) / 2;
            if (media >= 6.0) {
                System.out.println(conjuntoNomes[i]);
            }
        }

    }

}
