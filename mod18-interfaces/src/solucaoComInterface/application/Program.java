package solucaoComInterface.application;

import solucaoComInterface.model.entities.CarRental;
import solucaoComInterface.model.entities.Vehicle;
import solucaoComInterface.model.services.BrazilTaxService;
import solucaoComInterface.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.print("Entre com os dados do aluguel: ");
        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Entre com o preço por hora: ");
        double princePerHour = sc.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay, princePerHour, new BrazilTaxService());

        rentalService.processInvoice(cr);

        System.out.println("FATURA: ");
        System.out.println("Pagamento basico: " + cr.getInvoice().getBasicPayment());
        System.out.println("Imposto: " + cr.getInvoice().getTax());
        System.out.println("Pagamento Total: " + cr.getInvoice().getTotalPayment());

        sc.close();
    }
}
