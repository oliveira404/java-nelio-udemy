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
public class ex06 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int quantidadeValoresUsuario = entrada.nextInt();
        int[] conjuntoA = new int[quantidadeValoresUsuario];
        int[] conjuntoB = new int[quantidadeValoresUsuario];
        int[] conjuntoC = new int[quantidadeValoresUsuario];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < conjuntoA.length; i++) {
            int entradaUsuario = entrada.nextInt();
            conjuntoA[i] = entradaUsuario;
            conjuntoC[i] = entradaUsuario;
        }
        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < conjuntoB.length; i++) {
            int entradaUsuario = entrada.nextInt();
            conjuntoB[i] = entradaUsuario;
            conjuntoC[i] += entradaUsuario;

        }

        System.out.println("Vetor resultante: ");
        for (int j = 0; j < conjuntoB.length; j++) {
            System.out.println(conjuntoC[j]);
        }
    }

}
