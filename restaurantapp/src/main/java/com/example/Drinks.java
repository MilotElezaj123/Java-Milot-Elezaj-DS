package com.example;

public class Drinks {
    private String name;
    private double price;

    // Konstruktor për inicializimin e emrit dhe çmimit të pijes
    public Drinks(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter për emrin e pijes
    public String getName() {
        return name;
    }

    // Getter për çmimin e pijes
    public double getPrice() {
        return price;
    }

    // Metoda toString() për të shfaqur informacionin për drinkun
    @Override
    public String toString() {
        return name + " - $" + price;
    }
}
