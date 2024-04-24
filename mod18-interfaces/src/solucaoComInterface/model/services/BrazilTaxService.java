package solucaoComInterface.model.services;

public class BrazilTaxService implements TexService {

    @Override
    public double tax(double amount) {
        if (amount <= 100.0) return amount * 0.2;
        else return amount * 0.15;
    }
}
