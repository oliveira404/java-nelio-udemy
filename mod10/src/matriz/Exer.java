/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author igor
 */
public class Exer {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int linha = entrada.nextInt();

        int coluna = entrada.nextInt();
        
        int numeroDeBusca;
        int posicaoNumeroDeBuscaLinha = 0;
        int posicaoNumeroDeBuscaColuna = 0;

        System.out.println("matriz");
        int matriz[][] = new int[linha][coluna];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = entrada.nextInt();

            }
        }
        
        System.out.println("Vai buscar qual número? ");
        numeroDeBusca = entrada.nextInt();
        

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] == numeroDeBusca){
                    System.out.println("Position: " + "{" + i + "," + j + "}");
                    if(j > 0){
                        System.out.println("Left: " + matriz[i][j-1]);
                    }
                    
                    if(i > 0){
                        System.out.println("Up: " + matriz[i-1][j]);
                    }
                    
                    if(j < matriz[i].length-1){
                        System.out.println("Right: " + matriz[i][j+1]);
                    }
                    
                    if(i < matriz.length-1){
                        System.out.println("Down: " + matriz[i+1][j]);
                    }
                }
                
           
                
                
              
                

            }
        }

        entrada.close();
    }
}
