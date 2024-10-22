package com.example.foodshop;

public class Main {

    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.fillStock(new Vegetable("tomato", 700));
        shop.fillStock(new Dairy("milk", 360, 1));

        System.out.printf("\nStock items: \n%s\n", shop.showStock());

        System.out.printf("\nStock value: %.2f\n", shop.getStockValue());

        for (int i = 0; i < 3; i++) {
            shop.closeShop();
        }

        shop.sellItems(400, true);
        System.out.printf("\nStock items: \n%s\n", shop.showStock());

        for (int i = 0; i < 3; i++) {
            shop.closeShop();
        }

        shop.sellItems(200, false);
        System.out.printf("\nStock items: \n%s\n", shop.showStock());


    }
}
