package com.polymorphism;


public class Main {
    public static void main(String[] args) {
        // New Car object

    }
}

// Car class
class Bentley extends Car {
    public String model;
    public Bentley(String model) {
        super("Bentley", 2);
        this.model = model;
    }

    @Override
    public void accelerate() {
        System.out.println("This Bentley is goooooiiing...");
    }
}

