package solucaoComInterface.model.services;

import solucaoComInterface.model.entities.CarRental;
import solucaoComInterface.model.entities.Invoice;

import java.time.Duration;

public class RentalService {

    private Double pricePerDay;
    private Double pricePerhour;
    private TexService taxService;

    public RentalService(Double pricePerDay, Double pricePerhour, TexService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerhour = pricePerhour;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {
        double minutos = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutos / 60.0;

        double basicPayment;
        if (hours <= 12.0) {
            basicPayment = pricePerhour * Math.ceil(hours);
        } else {
            basicPayment = pricePerDay * Math.ceil(hours/24.0);
        }

        double tax = taxService.tax(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
