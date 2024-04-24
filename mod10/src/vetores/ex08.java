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
public class ex08 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        int conjunto[];
        int quantidadeValoresUsuario;
        int acumuladorDeValoresPares = 0;
        int contadorDeNunerosPares = 0;
        int media;
        boolean tempares = false;

        System.out.print("Quantos elementos vai ter o vetor? ");
        quantidadeValoresUsuario = entrada.nextInt();
        conjunto = new int[quantidadeValoresUsuario];

        for (int i = 0; i < conjunto.length; i++) {
            System.out.print("Digite um número: ");
            conjunto[i] = entrada.nextInt();

            if (conjunto[i] % 2 == 0) {
                acumuladorDeValoresPares += conjunto[i];
                tempares = true;
                contadorDeNunerosPares++;
            }
        }

        if (tempares) {
            media = acumuladorDeValoresPares / contadorDeNunerosPares;
            System.out.println("MÉDIA DOS PARES: " + media);
        } else {
            System.out.println("NENHUM NÚMERO PAR");
        }

    }

}
