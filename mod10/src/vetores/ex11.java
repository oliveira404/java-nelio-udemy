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
public class ex11 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        double conjuntoAltura[];
        char conjuntoGenero[];
        int quantidadePessoasDigitadas;
        String conversorCaixaAlta;
        double maiorAltura = 0;
        double menorAltura = 0;
        double mediaAlturasMulheres;
        double somaAlturas = 0;
        int numeroDeHomens = 0;
        int numeroDeMulheres = 0;

        System.out.print("Quantas pessoas serão digitadas ?");
        quantidadePessoasDigitadas = entrada.nextInt();
        conjuntoAltura = new double[quantidadePessoasDigitadas];
        conjuntoGenero = new char[quantidadePessoasDigitadas];
        entrada.nextLine();

        for (int i = 0; i < quantidadePessoasDigitadas; i++) {
            System.out.print("Altura da " + (i + 1) + "° pesssoa: ");
            conjuntoAltura[i] = entrada.nextDouble();
            entrada.nextLine();

            System.out.print("Gênero da " + (i + 1) + "° pesssoa: ");
            conjuntoGenero[i] = Character.toUpperCase(entrada.next().charAt(0));
        }

        for (int i = 0; i < quantidadePessoasDigitadas; i++) {
            if (conjuntoAltura[i] > maiorAltura) {
                maiorAltura = conjuntoAltura[i];
            }
        }

        menorAltura = maiorAltura;

        for (int i = 0; i < quantidadePessoasDigitadas; i++) {
            if (conjuntoAltura[i] < menorAltura) {
                menorAltura = conjuntoAltura[i];
            }
        }

        for (int i = 0; i < quantidadePessoasDigitadas; i++) {
            if (conjuntoGenero[i] == 'F') {
                somaAlturas += conjuntoAltura[i];
                numeroDeMulheres++;
            } else {
                numeroDeHomens++;
            }
        }

        System.out.println("Menor Altura " + menorAltura);
        System.out.println("Maior Altura " + maiorAltura);

        mediaAlturasMulheres = somaAlturas / numeroDeMulheres;

        System.out.println("Média das alturas das mulheres = " + mediaAlturasMulheres);

        System.out.println("Número de homens = " + numeroDeHomens);

        /*for (int i = 0; i < quantidadePessoasDigitadas; i++) {
            if (conjuntoAltura[i] < maiorAltura) {
                menorAltura = conjuntoAltura[i];
            } else {
                menorAltura = conjuntoAltura[i];
            }
        }*/
    }

}
