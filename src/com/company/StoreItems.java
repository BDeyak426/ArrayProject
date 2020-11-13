package com.company;

public class StoreItems {
    StoreItemList[] storeItems;
    private StoreItemList[] items = new StoreItemList[10];
    private static int count;

    public StoreItems() {
        this.storeItems = new StoreItemList[10];
    }

    public void add(StoreItemList product) {
        int count = 0;
        if (count == items.length) {
            throw new IndexOutOfBoundsException();
        }
        items[count] = product;
        count++;
    }

    public String toString() {
        String list = items[0].getBrand();
        for(int i = 1; i < items.length; i++) {
            if (items[i] == null) {
                return list;
            }
            list = list + ", " + items[i].getBrand();
        }
        return list;
    }

    public double getTotalCost() {
        double total = 0;
        for (StoreItemList item : this.storeItems) {
            if (item != null) {
                total += item.getCost();
            }
        }
        return total;
    }
}
