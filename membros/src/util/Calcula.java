/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import static membros.Membros.PI;

/**
 *
 * @author igor
 */
public class Calcula {

    public final double PI = 3.14159;

    
    
    public double circumferencia(double radius) {
        return 2.0 * PI * radius;
    }

    public double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
