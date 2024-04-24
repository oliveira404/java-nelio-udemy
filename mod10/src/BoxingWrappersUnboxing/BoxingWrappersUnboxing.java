/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoxingWrappersUnboxing;

/**
 *
 * @author igor
 */
public class BoxingWrappersUnboxing {
    public static void main(String[] args) {
        int x = 20;
        Object obj = x;
        //mostra 20 na tela
        System.out.println(obj);
        
        int y = (int) obj;
        //mostra 20
        System.out.println(y);
        
     
        
    }
    
}
