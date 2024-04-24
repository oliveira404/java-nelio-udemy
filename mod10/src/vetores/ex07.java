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
public class ex07 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        double conjunto[];
        double acumuladorConjunto = 0;
        double media;

        System.out.print("Quantos valores vai ter o vetor? ");
        int quantidadeValoresUsuario = entrada.nextInt();
        conjunto = new double[quantidadeValoresUsuario];
        
        for(int i = 0; i < conjunto.length; i++){
            System.out.print("Digite um número: ");
            conjunto[i] = entrada.nextDouble();
            acumuladorConjunto += conjunto[i];
        }
        
        media = acumuladorConjunto / conjunto.length;
        
        System.out.println("MÉDIA DO VETOR = " + media);
        
        System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");
        for(int j = 0; j < conjunto.length; j++){
            if(conjunto[j] < media){
                System.out.println(conjunto[j]);
            }
        }

    }

}
