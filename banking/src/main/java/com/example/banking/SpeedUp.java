package com.example.banking;

public class SpeedUp extends BankAccount {

    public SpeedUp(String name, Customer owner, double amount) {
        super(name, owner, amount);
        this.type = "SpeedUp";
    }

    @Override
    public double sendingCosts(double amount) {
        return 1000;
    }

    @Override
    public double receivingCosts(double amount) {
        return 200;
    }

    @Override
    public double bonus(Customer partner) {
        return this.partners.contains(partner) ? 0 : 5000;
    }
}
