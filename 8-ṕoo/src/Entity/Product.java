/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author igor
 */
public class Product {
    
    public String name;
    public double price;
    public int quantity;
    
    
    public double totalValueInStock(){
        return price * quantity;
    }
    
    public void addProduct(int quantity){
        this.quantity += quantity;
    }
    
    public void removeProduct(int quantity){
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
    }
    
    
}
