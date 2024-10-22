package com.example.foodshop;

public class Vegetable extends ShopItem {

    public Vegetable(String name, double price) {
        super(name, price);
    }

    @Override
    public int calculateFreshness() {
        if (this.daysInTheShop > 3) return 0;
        if (1 < this.daysInTheShop && this.daysInTheShop <= 3) return 1;
        return 2;
    }

    @Override
    public void reducePrice() {
        switch (this.calculateFreshness()) {
            case 2 -> System.out.printf("Old price: %.2f\nThe price has not been reduced yet!\n", this.price);
            case 1 -> System.out.printf("Old price: %.2f\nReduced price (%s): %.2f\n", this.price, "-20%", this.price *= 0.8);
            case 0 -> System.out.printf("Old price: %.2f\nReduced price (%s): %.2f\n", this.price, "-40%", this.price *= 0.6);
        }
    }
}
