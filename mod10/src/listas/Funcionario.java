/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author igor
 */
public class Funcionario {
    Long id;
    String nome;
    Double salario;
    
    
    public Funcionario(){
        
    }
    
    public Funcionario(Long id, String nome, Double salario){
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return id + ", " + nome + ", " + String.format("%.2f%n", salario);
    }
    
    
    
}
