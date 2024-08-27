package _10exercicio_fixacao_correcao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee {

    private String name;
    private String email;
    private Double salary;

    public Employee(String name, String email, Double salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String path = "/home/shark/workspace/back-end/java-nelio-udemy/mod20-programacao-funcional-expressoes-lambda/funcional-lambda/src/_09exercicio_fixacao/info.csv";
        System.out.println("full file path: Automatic Insertion!\n");

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Employee> employees = new ArrayList<Employee>();
            String line = br.readLine();

            while (line != null) {
                String[] fileds = line.split(",");
                employees.add(new Employee(fileds[0], fileds[1], Double.parseDouble(fileds[2])));
                line = br.readLine();
            }

            System.out.print("Enter Salary: ");
            double salary = entrada.nextDouble();

            List<String> emails = employees.stream()
                    .filter(x -> x.getSalary() > salary)
                    .map(x -> x.getEmail())
                    .sorted()
                    .toList();

            System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":");
            emails.forEach(System.out::println);

            double sum = employees.stream()
                    .filter(x -> x.getName().charAt(0) == 'M')
                    .map(x -> x.getSalary())
                    .reduce(0.0, (x, y) -> x + y);

            System.out.println("Sum of salary from people whose name starts with 'M': " + String.format("%.2f", sum));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        entrada.close();
    }
}
