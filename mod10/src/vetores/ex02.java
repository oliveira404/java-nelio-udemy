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
public class ex02 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int quantidadeValores = entrada.nextInt();

        int arrayValores[] = new int[quantidadeValores];
        int soma = 0;
        int media = 0;

        for (int i = 0; i < arrayValores.length; i++) {
            System.out.print("Digite um número: ");
            arrayValores[i] = entrada.nextInt();
        }

        System.out.print("\nVALORES = ");
        //System.out.print("\n\nSOMA = ");
        for (int j = 0; j < arrayValores.length; j++) {
            /*if (arrayValores[j] < 1) {
                System.out.println(arrayValores[j]);
            }*/
            System.out.print(arrayValores[j] + " " );
            
            soma = soma + arrayValores[j];
            
            media = soma / arrayValores.length;
            
        }
        
        System.out.println("\nSOMA: " + soma);
        System.out.println("MÉDIA: " + media);
        
        entrada.close();
    }

}
