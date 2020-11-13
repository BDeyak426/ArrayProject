package com.company;

public class StoreItemList {

    private String brand;
    private int quantity;
    private double pricePerUnit;

    public StoreItemList(String brand, int quantity, double pricePerUnit) {
        this.brand = brand;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public double getCost() {
        return this.quantity * this.pricePerUnit;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBrand() {
        return brand;
    }
}
