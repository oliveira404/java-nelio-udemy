package _01introducao;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Account acc = new Account(1000, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "maria", 0.0, 500.0);

        //UpCasting
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "bob", 1000.0, 500.0);
        Account acc3 = new SavingsAccount(1004, "ana", 0.0, 0.01);

        //DownCasting
        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);

        //vai dá erro
        //BusinessAccount acc5 = (BusinessAccount)acc3;

        //Evitando erro de downcasting
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(20.0);
            System.out.println("loan");
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("update");

        }

        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());
    }
}