import entities.Employee;
import entities.OutsourcedEmployee;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int quantityEmployee;
        int hours;
        Double valuePerHour;
        Double additionalCharge;
        boolean outsourced = false;
        String userResponse;
        String name;

        List<Employee> employeesList = new ArrayList<>();


        System.out.print("\nEnter the number of employees: ");
        quantityEmployee = entrada.nextInt();

        for (int i = 0; i < quantityEmployee; i++) {
            System.out.println("Employee #"+(i+1)+ " data:");
            System.out.print("Outsourced (y/n)? ");
            userResponse = entrada.next();

            System.out.print("Name: ");
            entrada.nextLine();
            name = entrada.nextLine();


            System.out.print("Hours: ");
            hours = entrada.nextInt();

            System.out.print("Value per hour: ");
            valuePerHour = entrada.nextDouble();

            if(userResponse.equals("y")) {
                System.out.print("Additional charge: ");
                additionalCharge = entrada.nextDouble();

                employeesList.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            } else {
                employeesList.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println("\nPAYMENTS: ");
        employeesList.forEach(element -> System.out.println(element));
    }

}