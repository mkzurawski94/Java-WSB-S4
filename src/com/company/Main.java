package com.company;

public class Main {

    public static void main(String[] args) {
        Human me = new Human();
        me.name = "Mateusz";
        me.lastName = "Zurawski";
        me.pet = new Animal("mouse");
        me.pet.name = "Cygan";
//        System.out.println(me.pet.name);
//        System.out.println(me.pet.species);
//
//        Animal azor = new Animal("dog");
//        azor.name = "Brygida";
//        System.out.println(azor.species);
//        me.pet = azor;
//        System.out.println(me.pet.name);
//
//        me.pet.takeForWalk();
//        me.pet.takeForWalk();
//        me.pet.takeForWalk();
//        me.pet.takeForWalk();
//        me.pet.feed();
//        me.pet.feed();
//        me.pet.feed();
//        me.pet.feed();
//        me.pet.takeForWalk();
//        me.pet.takeForWalk();
//        me.pet.takeForWalk();
//        me.pet.takeForWalk();
//        me.pet.takeForWalk();
//        me.pet.takeForWalk();
//        me.pet.feed();


        Car fura = new Car("e46", "bmw", 2.0);
        me.car = fura;
        System.out.println(me.car.model + me.car.producent + me.car.engineCapacity);
    }
}


