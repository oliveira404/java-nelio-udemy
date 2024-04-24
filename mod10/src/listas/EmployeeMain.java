/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author igor
 */
public class EmployeeMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        
        List<Employee> list = new ArrayList<>();
        int i = 0;
        
        System.out.print("How many employees will be registered: ");
        int n = entrada.nextInt();
        entrada.nextLine();
        
        while(i < list.size()){
            System.out.println("Employee");
            
            i++;
        }
        
        
        entrada.close();
    }
    
    
}
