package com.example.banking;

public class Main {

    public static void main(String[] args) {

        Customer john = new Customer("John Doe", 30, "male");
        Customer jane = new Customer("Jane Doe", 27, "female");
        Customer bob = new Customer("Bob Thomson", 39, "male");
        Customer mary = new Customer("Mary Thomson", 30, "female");

        BankAccount johns = new Savings("Doe family", john, 30000);
        BankAccount janes = new Balance("Jane's account", jane, 12000);
        BankAccount bobs = new SpeedUp("Thomson comp", bob, 50000);
        BankAccount marys = new Balance("Family", mary, 32000);
        BankAccount bobs2 = new Savings("Bob", bob, 20000);

        john.createAccount(johns);
        jane.createAccount(janes);
        bob.createAccount(bobs);
        mary.createAccount(marys);
        bob.createAccount(bobs2);

        john.generateStatus();
        jane.generateStatus();
        bob.generateStatus();
        mary.generateStatus();

        try {
            john.sendMoney("Doe Family", jane, "Jane's account", 5000);
        } catch (Exception e) {
            System.err.println(e);
            john.sendMoney("Doe family", jane, "Jane's account", 5000);
        }

        bob.sendMoney("Thomson comp", mary, "Family", 3000);
        bob.sendMoney("Thomson comp", bob, "Bob", 5000);

        john.generateStatus();
        jane.generateStatus();
        bob.generateStatus();
        mary.generateStatus();

        System.out.println(johns.history);
        System.out.println(janes.history);
        System.out.println(bobs.history);
        System.out.println(marys.history);
    }
}