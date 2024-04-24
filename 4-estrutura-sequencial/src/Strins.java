/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author igor
 */
public class Strins {
    public static void main(String[] args) {
        String s = "potato apple lemon orange";
        String[] vect = s.split(" ");//usando espaço "branco" como separador.
        
        for(int i = 0; i < vect.length; i++){
            System.out.print(vect[i]+" ");
           
        }
        System.out.println("");
    }
}
