/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package membrosEstaticos;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author igor
 */
public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("What is the dollar price? ");
        double cotacaoAtual = entrada.nextDouble();
        
        System.out.print("How many dollars will be bought? ");
        double quantidade = entrada.nextDouble();
        
        double resultado = CurrencyConverter.calcular(cotacaoAtual, quantidade);
        
        System.out.printf("Amount to be paid in reais: %.2f%n", resultado);
        
        
        double teste = 0.06 + 1.0;
        System.out.println("Teste: " + teste);
        
        
        
        entrada.close();
    }
}

/*
Faça um programa para ler a cotação do dólar, 

e depois um valor em dólares 

a ser comprado por uma pessoa em reais. 

Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
para ser responsável pelos cálculos.

*/
