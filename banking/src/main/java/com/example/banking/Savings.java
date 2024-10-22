package com.example.banking;

public class Savings extends BankAccount{

    public Savings(String name, Customer owner, double amount) {
        super(name, owner, amount);
        this.type = "Savings";
    }

    @Override
    public double sendingCosts(double amount) {
        return 100;
    }

    @Override
    public double receivingCosts(double amount) {
        return 20;
    }

    @Override
    public double bonus(Customer partner) {
        return 0;
    }
}
