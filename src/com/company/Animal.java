package com.company;

import java.io.File;

public class Animal {
    public final String species;
    public String name;
    private Double weight;
    File pic;

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

}

