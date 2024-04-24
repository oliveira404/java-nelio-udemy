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
public class ex09 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int conjuntoPessas[];

        String conjuntoNomes[];
        int conjuntoIdades[];
        int quantidadeValoresUsuario;
        int acumuladorDeValoresPares = 0;
        int contadorDeNunerosPares = 0;
        int media;
        boolean tempares = false;
        int pegaMaiorIdade = 0;
        String pegaNomeDoMaiorIdade = "";

        System.out.print("Quantas pessoas você vai digitar? ");
        quantidadeValoresUsuario = entrada.nextInt();
        entrada.nextLine();

        conjuntoPessas = new int[quantidadeValoresUsuario];
        conjuntoNomes = new String[quantidadeValoresUsuario];
        conjuntoIdades = new int[quantidadeValoresUsuario];

        for (int i = 0; i < conjuntoPessas.length; i++) {
            System.out.println("Dados da " + (i + 1) + " pessoa: ");

            System.out.print("Nome: ");
            conjuntoNomes[i] = entrada.nextLine();

            System.out.print("Idade: ");
            conjuntoIdades[i] = entrada.nextInt();
            entrada.nextLine();

        }

        for (int i = 0; i < conjuntoPessas.length; i++) {
            if (conjuntoIdades[i] > pegaMaiorIdade) {
                pegaMaiorIdade = conjuntoIdades[i];
                pegaNomeDoMaiorIdade = conjuntoNomes[i];
            }
        }

        System.out.println("Pessoa mais velha: " + pegaNomeDoMaiorIdade);
        entrada.close();
    }

}
