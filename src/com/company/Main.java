package com.company;

import device.Car;
import device.Phone;

public class Main {

    public static void main(String[] args) {
        Human me = new Human();
        me.name = "Mateusz";
        me.lastName = "Zurawski";

        Car fura = new Car("fiat", "lupo", 1.2);
        fura.value = 30000.0;

//        me.setSalary(1000.0);
//        me.setCar(fura);
//        me.getCar();

        Car fura2 = new Car("fiat", " lupo", 1.2);

        if (fura == fura2)
            System.out.println("== równe");

        if (fura.equals(fura2))
            System.out.println(".equals() równe");
        Phone smartfon = new Phone();
        smartfon.producer = "Alcatel";
        smartfon.model = "123C";
        smartfon.screenSize = 4.3;
        me.phone = smartfon;
//        System.out.println(me.phone);


        System.out.println(me);
        me.pet = new Animal("lion");
        me.pet.name = "zygmunt";
        System.out.println(me.pet);


    }
}


