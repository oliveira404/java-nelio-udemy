  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores;

import java.util.Locale;
import java.util.Scanner;


import java.util.Locale;
import java.util.Scanner;


/*
public class ex03 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double mediaAltura = 0.0;
        int pegadorIdades = 0;
        Pessoa pegadorPessoasIdadeMenor16[];

        System.out.print("Quantas pessoas serão digitadas? ");
        Pessoa conjuntoPessoas[] = new Pessoa[entrada.nextInt() + 1];
        entrada.nextLine(); // Limpa o buffer

        for (int i = 1; i < conjuntoPessoas.length; i++) {

            System.out.println("Dados da " + i + "ª pessoa:");

            Pessoa pessoa = new Pessoa();

            System.out.print("Nome: ");
            pessoa.nome = entrada.nextLine();

            System.out.print("Idade: ");
            pessoa.idade = entrada.nextInt();
            entrada.nextLine(); // Limpa o buffer

            System.out.print("Altura: ");
            pessoa.altura = entrada.nextDouble();
            entrada.nextLine(); // Limpa o buffer

            mediaAltura += pessoa.altura;

            conjuntoPessoas[i] = pessoa;

        }

        System.out.printf("Altura média: %.2f%n", mediaAltura / (conjuntoPessoas.length - 1));

        for (int j = 1; j < conjuntoPessoas.length; j++) {
            if (conjuntoPessoas[j].idade > 16) {
                conjuntoPessoas[j] = null;
            }
        }

        int acumuladorDeIdades = 0;
        int totalPessoasNaoNulas = 0;

        for (int k = 1; k < conjuntoPessoas.length; k++) {
            if (conjuntoPessoas[k] != null) {
                acumuladorDeIdades += conjuntoPessoas[k].idade;
                totalPessoasNaoNulas++;
            }
        }

        double porcentagem = ((double) totalPessoasNaoNulas / ((double) conjuntoPessoas.length - 1)) * 100;
        System.out.println("Porcentagem de pessoas maiores de 16 anos: " + porcentagem + "%");

        for (int i = 1; i < conjuntoPessoas.length; i++) {
            if (conjuntoPessoas[i] != null) {
                System.out.println(conjuntoPessoas[i].nome);
            }
        }

        entrada.close();

    }

}*/
/**
 *
 * @author igor
 */


public class ex03 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double mediaAltura = 0.0;
        double porcentagem = 0;
        Pessoa pessoa;

        System.out.print("Quantas pessoas serão digitadas? ");
        Pessoa[] conjuntoPessoas = new Pessoa[entrada.nextInt() + 1];
        entrada.nextLine(); // Limpa o buffer

        for (int i = 1; i < conjuntoPessoas.length; i++) {
            System.out.print("Dados da " + i + "° pessoa: ");

            pessoa = new Pessoa();

            System.out.println("");

            System.out.print("Nome: ");
            pessoa.nome = entrada.nextLine();

            System.out.print("Idade: ");
            pessoa.idade = entrada.nextInt();
            //entrada.nextLine(); // limpa o buffer
            entrada.nextLine();

            System.out.print("Altura: ");
            pessoa.altura = entrada.nextDouble();
            //entrada.nextLine(); // limpa o buffer
            entrada.nextLine();

            mediaAltura = mediaAltura + pessoa.altura;

            conjuntoPessoas[i] = pessoa;

        }

        System.out.println(conjuntoPessoas.length - 1);
        System.out.printf("Altura média: %.2f%n", mediaAltura / (conjuntoPessoas.length - 1));

        anularIdadesMaioresQue16(conjuntoPessoas);

        int acumuladorDeIdades = 0;
        int totalPessoasNaoNulas = 0;
        for (int k = 1; k < conjuntoPessoas.length; k++) {
            if (conjuntoPessoas[k] != null) {

                acumuladorDeIdades += conjuntoPessoas[k].idade;

                totalPessoasNaoNulas++;
            }
        }

        porcentagem = ((double) totalPessoasNaoNulas / ((double) conjuntoPessoas.length - 1)) * 100;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);

        for (int i = 1; i < conjuntoPessoas.length; i++) {
            if (conjuntoPessoas[i] != null) {
                System.out.println(conjuntoPessoas[i].nome);
            }
        }

        entrada.close();
    }

    public static Pessoa[] anularIdadesMaioresQue16(Pessoa[] conjunto) {
        for (int j = 1; j < conjunto.length; j++) {
            if (conjunto[j].idade > 15) {
                conjunto[j] = null;
            }
        }
        return conjunto;
    }

}
