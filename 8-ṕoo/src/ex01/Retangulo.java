/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01;

/**
 *
 * @author igor
 */
public class Retangulo {
    public double width;
    public double height;
    
    public double area(double width, double height){
        return this.width * this.height;
    }
    
    public double perimetro(double width, double height){
        return 2 * (this.width + this.height);
    }
    
    public double diagonal(double width, double height){
        return Math.round(Math.sqrt(this.width * this.width + this.height * this.width));
       
                
                
    }
}
