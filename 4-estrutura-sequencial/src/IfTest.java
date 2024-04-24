
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
public class IfTest {
    public static void main(String[] args) {
        
    
        
   
                
        Scanner entrada = new Scanner(System.in);
        
        String nome = entrada.next(); 
        
        String valor =  (nome.equals("igor")) ? "verdade" : "falso";
        
        
        
        System.out.println(nome);
        System.out.println(valor);
        
        entrada.close();
        
    
            
        
    }
    
}
