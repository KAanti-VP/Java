package com.example.banking;

import java.security.InvalidParameterException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer {

    String name;
    int age;
    String gender;
    List<BankAccount> bankAccount = new ArrayList<>();

    public Customer(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.bankAccount = new ArrayList<>();
    }

    public void createAccount(BankAccount account) {
        if (isThereThisAccountName(account.name)) {
            System.out.println("No account name duplication is allowed");
        } else {
            this.bankAccount.add(account);
        }
    }

    private boolean isThereThisAccountName(String accountName) {
        for (BankAccount ba: this.bankAccount)
            if (ba.name.equals(accountName))
                return true;
        return false;
    }

    public void sendMoney(String senderAccountName, Customer partner, String partnerAccountName, int amount) {
        if (isThereThisAccountName(senderAccountName)) {
            BankAccount account = getAccount(senderAccountName);
            account.balance -= amount;
            account.lastUsageDate = LocalDate.now();
            account.history.add(String.format("%d Ft sent to %s from the account %s at %s", amount, partner.name, senderAccountName, account.lastUsageDate));
            partner.receiveMoney(partnerAccountName, this, amount);
            double costs = account.sendingCosts(amount);
            account.balance -= costs;
            account.history.add(String.format("Sending transaction costs %.2f Ft", costs));
            if (account.bonus(partner) != 0) {
                account.balance += account.bonus(partner);
                account.history.add(String.format("%.2f Ft bonus for sending money to a new partner", account.bonus(partner)));
            }
            addPartner(account, partner);
        } else {
            throw new InvalidParameterException(String.format("There is no sender account under the name %s", senderAccountName));
        }
    }

    private BankAccount getAccount(String accountName) {
        BankAccount account = null;
        for (BankAccount ba: this.bankAccount)
            if (ba.name.equals(accountName)) {
                account = ba;
                break;
            }
        return account;
    }

    private void addPartner(BankAccount account, Customer partner) {
        if (!account.partners.contains(partner))
            account.partners.add(partner);
    }

    public void receiveMoney(String receiverAccountName, Customer sender, int amount) {
        if (isThereThisAccountName(receiverAccountName)) {
            BankAccount account = getAccount(receiverAccountName);
            account.balance += amount;
            account.lastUsageDate = LocalDate.now();
            account.history.add(String.format("%d Ft received from %s to the account %s at %s", amount, sender.name, receiverAccountName, account.lastUsageDate));
            addPartner(account, sender);
            double costs = account.receivingCosts(amount);
            account.balance -= costs;
            account.history.add(String.format("Receiving transaction costs %.2f Ft", costs));
        } else {
            throw new InvalidParameterException(String.format("There is no receiver account under the name [%s]", receiverAccountName));
        }
    }

    public void generateStatus() {
        for (BankAccount ba: this.bankAccount) {
            System.out.println(ba.toString());
        }
    }
}