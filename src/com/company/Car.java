package com.company;

public class Car {
    public final String model;
    public final String producent;
    public final double engineCapacity;
    public String color;
    public Double value;

    public Car(String model, String producent, Double engineCapacity) {
        this.model = model;
        this.producent = producent;
        this.engineCapacity = engineCapacity;


    }

    void wypisz() {
        System.out.println(model + " " + producent + " " + engineCapacity + " " + value);
    }
}

