package com.rental;

public class Renter {
    private int id;
    private String name;

    public Renter(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Арендатор [ID=" + id + ", Имя='" + name + "']";
    }
}