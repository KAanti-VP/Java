package com.example.foodshop;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    List<ShopItem> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public Shop(List<ShopItem> stock) {
        this.stock = stock;
    }

    public void fillStock(ShopItem item) {
        this.stock.add(item);
    }

    public List<String> showStock() {
        List<String> items = new ArrayList<>();
        int i = 1;
        for (ShopItem item: this.stock)
            items.add(String.format("%d. item: %s, %.0f Ft, %s freshness", i++, item.name, item.price, item.convertFreshnessToString()));
        return items;
    }

    public double getStockValue() {
        double result = 0.0;
        for (ShopItem item: this.stock)
            result += item.price;
        return  result;
    }

    public void sellItems(double price, boolean superHealthy) {
        List<ShopItem> removable = new ArrayList<>();
        if (superHealthy) {
            for (ShopItem item: this.stock) {
                if (item.calculateFreshness() == 2 && item.preservativePercentage < 2 && item.price <= price) {
                    price = Math.max(price - item.price, 0);
                    removable.add(item);
                }
                if (price == 0)
                    break;
            }
        } else {
            for (ShopItem item: this.stock) {
                if (item.price <= price) {
                    price = Math.max(price - item.price, 0);
                    removable.add(item);
                }
                if (price == 0)
                    break;
            }
        }
        for (ShopItem item: removable)
            this.stock.remove(item);
    }

    public void closeShop() {
        System.out.println("\nChecking and reducing every price...");
        for (ShopItem item: this.stock) {
            item.incrementDaysInTheShop();
            System.out.printf("--- %s ---:\n", item.name);
            item.reducePrice();
        }
    }
}
