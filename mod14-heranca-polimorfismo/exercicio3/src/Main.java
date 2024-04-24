import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();
        int numberOfPayers = 0;
        Double totalTax = 0.0;

        char select;

        String name;
        Double anualIncome;
        Double healthExpenditures;

        Integer numberOfEmployees;

        System.out.print("Enter the number of tax payers: ");
        numberOfPayers = input.nextInt();

        for (int i = 0; i < numberOfPayers; i++) {
            System.out.print("Individual or company (i/c)? ");
            select = input.next().charAt(0);

            if (select == 'i') {
                System.out.print("Name: ");
                name = input.next();

                System.out.print("Anual Income: ");
                anualIncome = input.nextDouble();

                System.out.print("Health expenditures: ");
                healthExpenditures = input.nextDouble();

                list.add(new Individual(name, anualIncome, healthExpenditures));
            } else {
                System.out.print("Name: ");
                name = input.next();

                System.out.print("Anual Income: ");
                anualIncome = input.nextDouble();

                System.out.print("Number of employees: ");
                numberOfEmployees = input.nextInt();

                list.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }

        System.out.println("TAXES PAID: ");
        for (TaxPayer taxPayer : list) {
            System.out.println(taxPayer);

            totalTax = totalTax + taxPayer.tax();
        }
        System.out.println("\nTOTAL TAXES: " + totalTax);

        input.close();
    }
}