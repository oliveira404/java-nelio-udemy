package usandoDefaultMethods;

import java.security.InvalidParameterException;

public class USAinterestService implements InterestService {

    private double interestRate;

    public USAinterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
