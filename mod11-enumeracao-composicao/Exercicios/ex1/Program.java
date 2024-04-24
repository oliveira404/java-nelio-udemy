package Exercicios.ex1;

import Exercicios.ex1.entities.Department;
import Exercicios.ex1.entities.HourContract;
import Exercicios.ex1.entities.Worker;
import Exercicios.ex1.enums.WorkerLevel;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception{
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Entre com o nome do departamento: ");
        String departamentName = entrada.nextLine();

        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = entrada.nextLine();

        System.out.print("Level: ");
        String workerLevel = entrada.nextLine();

        System.out.print("Base Salary: ");
        double baseSalary = entrada.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departamentName));

        System.out.print("How many contracts to this worker? ");
        int n = entrada.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Enter contract #" + i + " data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(entrada.next());
            System.out.print("Value per hour: ");
            double valorPorHora = entrada.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = entrada.nextInt();
            HourContract contract = new HourContract(contractDate, valorPorHora, hours);
            worker.addContract(contract);
        }

        System.out.println();

        System.out.print("Enter month and year to calculate income (MM/yyyy): ");
        String monthAndYear = entrada.next();
        int mes = Integer.parseInt(monthAndYear.substring(0, 2)); //no final tem q passar 1 a+
        int ano = Integer.parseInt(monthAndYear.substring(3)); //vai cortar de 3 em diante

        System.out.println("Name: " + worker.getName());
        System.out.println("Departament: " + worker.getDepartment().getName());
        System.out.println("Income for: " + monthAndYear + ": " + String.format("%.2f", worker.income(ano, mes)));






        entrada.close();
    }
}
