package com.example.foodshop;

public class Dairy extends ShopItem {

    public Dairy(String name, double price, int preservativePercentage) {
        super(name, price, preservativePercentage);
    }

    @Override
    public int calculateFreshness() {
        if (this.daysInTheShop > 5) return 0;
        if (3 < this.daysInTheShop && this.daysInTheShop <= 5) return 1;
        return 2;
    }
}
