package com.company;

import device.Car;
import device.Device;
import device.Phone;

public class Main {

    public static void main(String[] args) {
        Human me = new Human();
        me.name = "Mateusz";
        me.lastName = "Zurawski";

        Car a = new Car("audi", "80", 1.0);
        a.yearOfProduction = 1999;
        a.color = "red";
        Phone tel = new Phone("samsung", "s10", 4.3);
        me.phone = tel;
        System.out.println(me.phone);
        System.out.println(tel);
        tel.turnOn();
        a.turnOn();
        System.out.println(a);


    }
}


