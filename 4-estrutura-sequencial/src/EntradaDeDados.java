
import java.util.Locale;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author igor
 */
public class EntradaDeDados {
    public static void main(String[] args) {
        //Locale.setDefault(Locale.UK);
        Scanner scanner = new Scanner(System.in);
        
        char x = scanner.next().charAt(0);
        
        System.out.println("Caracter: " + x);
        
        //para encerrar 
        scanner.close();
    }
    
}
