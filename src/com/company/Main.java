package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        StoreItemList product1 = new StoreItemList("Oreos", 1, 1.99);
        StoreItemList product2 = new StoreItemList("Cheetos", 2, 3.99);
        StoreItemList product3 = new StoreItemList("Nesquik", 5, 2.50);
        StoreItemList product4 = new StoreItemList("Sushi", 10, 13.99);
        StoreItemList product5 = new StoreItemList("Barq's Root Beer", 4, 1.50);
        StoreItemList product6 = new StoreItemList("Simply Lemonade", 2, 2.99);

        StoreItems storeItems = new StoreItems();
        storeItems.add(product1);
        storeItems.add(product2);
        storeItems.add(product3);
        storeItems.add(product4);
        storeItems.add(product5);
        storeItems.add(product6);

        String storeListOfItems = storeItems.toString();
        double totalCost = storeItems.getTotalCost();

        System.out.println("Products: " + storeListOfItems);
        System.out.println("Total Cost : $" + storeItems.getTotalCost());
    }
}
