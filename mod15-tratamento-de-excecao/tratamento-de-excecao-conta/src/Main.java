import model.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        Integer number = 0;
        String holder = "";

        System.out.println("Enter account data");
        number = verificarAccountNumber(entrada);
        entrada.nextLine();


        System.out.print("Holder: ");
        holder = entrada.nextLine();

        System.out.print("Initial balance: ");
        Double initialBalance = entrada.nextDouble();
        entrada.nextLine();

        System.out.print("Enter withdraw limit: ");
        Double withdrawLimit = entrada.nextDouble();

        Account c1 = new Account(number, holder, initialBalance, withdrawLimit);

        System.out.print("\nEnter amount for withdraw: ");
        Double amountForWithdraw = entrada.nextDouble();

        try {
            c1.withdraw(amountForWithdraw);
            System.out.print("New balance: " + c1.getBalance());
        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }

        entrada.close();
    }

    private static Integer verificarAccountNumber(Scanner scanner) {
        Integer accountNumber = 0;
        boolean validInput = false;

        do {
            System.out.print("Number: ");
            if (scanner.hasNextInt()) {
                accountNumber = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        } while (!validInput);

        return accountNumber;
    }
}