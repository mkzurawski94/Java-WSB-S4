package com.company;

public class Main {

    public static void main(String[] args) {
        Human me = new Human();
        me.name = "Mateusz";
        me.lastName = "Zurawski";

        Car fura = new Car("Fiat", "Lupo", 1.2);
        fura.value = 30000.0;

        me.setSalary(8000.0);

        me.setCar(fura);
        me.getCar();


    }
}


