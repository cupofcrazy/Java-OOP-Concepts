package com.polymorphism;

public class Car {
    private String name;
    private boolean engine = true;
    private int cylinders;
    private int wheels = 4;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
    public void startEngine() {
        System.out.println("The engine is started");
    }
    public void accelerate() {
        System.out.println("This car is accelerating...");
    }
    public void brake() {
        System.out.println("Hit! Phew. That was close.");
    }
}
