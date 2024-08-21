package _13_exercicio_proposto;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Set<Integer> morning = new HashSet<>();
        Set<Integer> afternoon = new HashSet<>();
        Set<Integer> night = new HashSet<>();

        System.out.print("How many customers in the morning? ");
        Integer numberCustomers = entrada.nextInt();
        for (int i = 1; i <= numberCustomers; i++) {
            System.out.print("Code Number From Customer " + i +"°: ");
            Integer number = entrada.nextInt();
            morning.add(number);
        }

        System.out.print("How many customers in the afternoon? ");
        numberCustomers = entrada.nextInt();
        for (int i = 1; i <= numberCustomers; i++) {
            System.out.print("Code Number From Customer " + i +"°: ");
            Integer number = entrada.nextInt();
            afternoon.add(number);
        }

        System.out.print("How many customers in the night? ");
        numberCustomers = entrada.nextInt();
        for (int i = 1; i <= numberCustomers; i++) {
            System.out.print("Code Number From Customer " + i +"°: ");
            Integer number = entrada.nextInt();
            night.add(number);
        }

        Set<Integer> total = new HashSet<>(morning);
        total.addAll(afternoon);
        total.addAll(night);

        System.out.println("Total unique customers: " + total.size());
        entrada.close();
    }
}
