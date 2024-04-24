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
public class ex05 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        int maiorValor = 0;
        int pegadorDePosicaoMaior = 0;

        System.out.print("Quantos números você vai digitar ? ");
        int[] conjuntoNumeros = new int[entrada.nextInt()];

        for (int i = 0; i < conjuntoNumeros.length; i++) {
            System.out.print("Digite um número: ");
            conjuntoNumeros[i] = entrada.nextInt();
        }

        for (int i = 0; i < conjuntoNumeros.length; i++) {
            if (conjuntoNumeros[i] > maiorValor) {

                maiorValor = conjuntoNumeros[i];
                pegadorDePosicaoMaior = i;
                
            } //else {
               // maiorValor = conjuntoNumeros[i];
            //}

        }
        System.out.println(maiorValor);
        System.out.println(pegadorDePosicaoMaior);
    }

}
