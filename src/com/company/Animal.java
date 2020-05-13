package com.company;

import java.io.File;

public class Animal implements Salleable {
    public final String species;
    public String name;
    private Double weight;
    File pic;
    public Human owner;

    public static final Double DEFAULT_DOG_WEIGHT = 5.0;
    public static final Double DEFAULT_LION_WEIGHT = 50.0;
    public static final Double DEFAULT_MOUSE_WEIGHT = 0.5;


    public Animal(String species) {
        this.species = species;
        switch (species) {
            case "dog":
                this.weight = DEFAULT_DOG_WEIGHT;
                break;
            case "lion":
                this.weight = DEFAULT_LION_WEIGHT;
                break;
            case " mouse":
                this.weight = DEFAULT_MOUSE_WEIGHT;
                break;

        }
    }

    @Override
    public void sell(Human buyer, Human seller, Double price) {
        if (seller.pet != null) {
            if (buyer.cash >= price) {
                buyer.pet = seller.pet;
                buyer.cash -= price;
                seller.cash += price;
                owner = buyer;
                seller.pet = null;
                System.out.println("Animal friend is sold");
            } else
                System.out.println("Not enought money sir");
        } else
            System.out.println("Human dont have animal");


    }

    void feed() {
        if (weight > 0) {
            weight += 1;
            System.out.println("THX for food ");
        } else {
            System.out.println("Cannot feed " + name + " because dead animal cant eat");
        }
    }

    void takeForWalk() {
        if (weight > 0) {
            weight -= 1;
            System.out.println("THX for a walk");
        } else {
            System.out.println("cannot walk with " + name);
            System.out.println(name + " is dead");
            System.out.println("*Funeral music*");
        }
    }

    @Override
    public java.lang.String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", pic=" + pic +
                '}';
    }
}

