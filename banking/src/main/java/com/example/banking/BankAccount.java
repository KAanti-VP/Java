package com.example.banking;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public abstract class BankAccount {
    String name;
    Customer owner;
    double balance;
    List<String> history = new ArrayList<>();
    List<Customer> partners = new ArrayList<>();
    LocalDate lastUsageDate;
    String type;

    protected BankAccount(String name, Customer owner, double startingBalance) {
        this.name = name;
        this.owner = owner;
        this.balance = startingBalance;
        this.lastUsageDate = LocalDate.now();
        this.partners.add(owner);
        this.history.add(String.format("%.2f Ft received from %s to the account %s at %s", startingBalance, owner.name, name, this.lastUsageDate));
    }

    @Override
    public String toString() {
        return String.format("%s account:\n", this.name) +
                String.format("Account type: \"%s\"\n", this.type) +
                String.format("The number of transaction partners: %d\n", this.partners.size()) +
                String.format("Last account usage happened %d days ago\n", Math.abs(Period.between(this.lastUsageDate, LocalDate.now()).getDays())) +
                String.format("The actual balance is: %.2f Ft\n", this.balance);
    }

    public abstract double sendingCosts(double amount);
    protected abstract double receivingCosts(double amount);
    protected abstract double bonus(Customer partner);
}