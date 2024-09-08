package org.example;

public class Account {


    double balance;

    public Account() {
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double withdraw(double amount) {
        if (amount <= balance){
            balance -= amount;
            return amount;
        }
        return 0.0;
    }

    public double getBalance() {
        return this.balance;
    }
}
