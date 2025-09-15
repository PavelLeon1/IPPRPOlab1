package com.rental;

public class Apartment {
    private int id;
    private String address;
    private double price; // цена аренды в месяц

    public Apartment(int id, String address, double price) {
        this.id = id;
        this.address = address;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Квартира [ID=" + id + ", Адрес='" + address + "', Цена=" + price + "]";
    }
}