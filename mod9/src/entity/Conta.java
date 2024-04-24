/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author igor
 */
public class Conta {

    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public Conta(int numeroConta, String nomeTitular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        depositar(depositoInicial);
    }

    public Conta(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }
    
    public Conta(){
        
    }
    
    public void depositar(double valorParaDeposito){
        this.saldo = this.saldo + valorParaDeposito;
    }
    
    public void sacar(double quantidade){
        /*if(this.saldo > 0){
          double saldoJuros = (this.saldo = this.saldo - quantidade) - 5;
           
          this.saldo = saldoJuros;
        }*/
        
        if(this.saldo > 0)
            this.saldo = this.saldo - (quantidade + 5.0);
       
        
        /*this.saldo <= 0 ? "Valor indisponível para saque" : this.saldo -= valorParaSacar;*/
        
        
    }
    
    /*public String setNomeTitular(String nomeTitular){
        return this.nomeTitular = nomeTitular;
    }*/

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    

    public int getNumeroConta() {
        return numeroConta;
    }
    
   

    public String getNomeTitular() {
        return nomeTitular;
    }
    
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }
        

    @Override
    public String toString() {
        return "Conta: " + this.numeroConta + "; Titular: " + this.nomeTitular + String.format("; Saldo: R$ %.2f;", this.saldo);
    }
    
    
    
    
    
    

    
    
    
    
}


