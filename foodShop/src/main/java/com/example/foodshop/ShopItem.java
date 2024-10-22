package com.example.foodshop;

public abstract class ShopItem {

    String name;
    double price;
    int preservativePercentage;
    int daysInTheShop;

    public ShopItem() {}
    public ShopItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.preservativePercentage = 0;
        this.daysInTheShop = 0;
    }

    public ShopItem(String name, double price, int preservativePercentage) {
        this.name = name;
        this.price = price;
        this.preservativePercentage = preservativePercentage;
        this.daysInTheShop = 0;
    }

    public abstract int calculateFreshness();

    public void reducePrice() {
        switch (this.calculateFreshness()) {
            case 2 -> System.out.printf("Old price: %.2f\nThe price has not been reduced yet!\n", this.price);
            case 1 -> System.out.printf("Old price: %.2f\nReduced price (%s): %.2f\n", this.price, "-30%", this.price *= 0.7);
            case 0 -> System.out.printf("Old price: %.2f\nReduced price (%s): %.2f\n", this.price, "-50%", this.price *= 0.5);
        }
    }

    public String convertFreshnessToString() {
        String result = "";
        switch (this.calculateFreshness()) {
            case 2 -> result = "good";
            case 1 -> result = "ok";
            case 0 -> result = "bad";
            default -> throw new ArithmeticException("No accepted freshness value.");
        }
        return result;
    }

    public void incrementDaysInTheShop() {
        this.daysInTheShop++;
    }
}
