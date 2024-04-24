/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package membrosEstaticos;

/**
 *
 * @author igor
 */
public class CurrencyConverter {
    public static final double IOF = 0.06;
    
    
    public static double calcular(double cotacaoAtual, double quantidadeDolar){
        return cotacaoAtual * quantidadeDolar * (1.0 + IOF);
    }
}