package model;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;


    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) {
        this.balance = this.balance + amount;
    }

    public void withdraw(Double amount) {
        if (amount > this.withdrawLimit) throw new RuntimeException("Withdraw error: The amount exceeds withdraw limit");
        if (amount > this.balance) throw new RuntimeException("Withdraw error: Not enough balance.");

        this.balance = this.balance - amount;
    }

    public Double getBalance() {
        return balance;
    }
}
