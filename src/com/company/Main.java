package com.company;

import device.Car;
import device.Device;
import device.Phone;

public class Main {

    public static void main(String[] args) {
        Human me = new Human("Mateusz", "Żurawski", 0.0);
        Human wife = new Human("Grażyna", "Jakaśtam", 8000.0);
        Human son = new Human("Jas", "Obcy", 0.0);

        //sprzedaz telefonu
//        Phone p1 = new Phone("Samsung", "s10", 4.3);
//        me.phone = p1;
//        p1.owner = me;
//        me.phone.sell(wife, me, 2000.0);


        //sprzedaz auta
        Car car = new Car("daweoo", "Matiz", 0.6);
        me.car = car;
        car.owner = me;
        car.sell(wife, me, 5000.0);

        //Sprzedaz czlowieka
//        son.sell(me,wife,0.0);

        //Sprzedaż zwierzaczka
//     Animal pet1= new Animal("dog");
//     pet1.name="Sebastian";
//     me.pet=pet1;
//     pet1.owner=me;
//        System.out.println(pet1.owner);
//     pet1.sell(wife,me,200.0);
//        System.out.println(pet1.owner);


    }
}


