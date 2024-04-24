/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex02;

/**
 *
 * @author igor
 */
public class Empregado {
    String nome;
    double salarioBruto;
    double imposto;
    
    public double salarioLiquido(double salario){
        return this.salarioBruto - this.imposto;
    }
    
    public void aumentarSalario(double porcentagem){
        salarioBruto += (porcentagem / 100 * salarioBruto);
    }

    @Override
    public String toString() {
        return "Empregado: " + this.nome + ", $ " + 
                String.format("%.2f", salarioLiquido(this.salarioBruto));
    }
    
    
    
}
