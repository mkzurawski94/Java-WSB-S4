package com.company;

import java.io.File;

public class Animal {
    public final String species;
    public String name;
    protected double weight;
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

}
