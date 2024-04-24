/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod9;

import entity.Conta;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author igor
 */
public class Mod9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Conta conta = null;

        System.out.print("Entre com o número da conta: ");
        int numeroConta = entrada.nextInt();

        System.out.print("Nome títular: ");
        entrada.nextLine();

        String nomeTitular = entrada.nextLine();

        System.out.print("Deseja entrar com depósito inicial (s/n)? ");
        char escolhaUsuario = entrada.next().toLowerCase().charAt(0);

        //conta.setNomeTitular(nomeTitular);
        //conta.setNumeroConta(numeroConta);
        switch (escolhaUsuario) {
            case 's':
                System.out.print("Entre com o saldo inicial: ");
                double saldoInicial = entrada.nextDouble();
                //conta.setSaldo(entrada.nextDouble());
                conta = new Conta(numeroConta, nomeTitular, saldoInicial);
                break;
            case 'n':
                conta = new Conta(numeroConta, nomeTitular);
                break;
        }

        System.out.println("\nAtualização: ");
        System.out.println(conta);

        System.out.print("\nEntre com valor de depósito: ");
        conta.depositar(entrada.nextDouble());

        System.out.println("Atualização: ");
        System.out.println(conta);

        System.out.print("\nEntre com valor de retirada: ");
        conta.sacar(entrada.nextDouble());

        System.out.println("Atualização: ");
        System.out.println(conta);

        entrada.close();

    }

}

/*
Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
mostrando os dados da conta após cada operação.
 */
