package com.example.banking;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Balance extends BankAccount {

    public Balance(String name, Customer owner, double amount) {
        super(name, owner, amount);
        this.type = "Balance";
    }

    @Override
    public double sendingCosts(double amount) {
        return amount * 0.002;
    }

    @Override
    public double receivingCosts(double amount) {
        DayOfWeek day = DayOfWeek.of(LocalDate.now().get(ChronoField.DAY_OF_WEEK));
        return day == DayOfWeek.SUNDAY || day == DayOfWeek.SATURDAY ? amount * 0.003 : amount * 0.001;
    }

    @Override
    public double bonus(Customer partner) {
        return 0;
    }
}
