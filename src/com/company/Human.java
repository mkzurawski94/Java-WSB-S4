package com.company;

import device.Car;
import device.Device;
import device.Phone;

public class Human implements Salleable {
    public String name;
    public String lastName;
    public Double weight;
    public Phone phone;
    public Animal pet;
    public Car car;
    private Double salary = 2000.0;
    public Double cash;

    public Human(String name, String lastName, Double cash) {
        this.lastName = lastName;
        this.name = name;
        this.cash = cash;
    }

    public Car getCar() {
        System.out.println(name + " " + lastName + " have: " + car.model + " " + car.producer);
        return car;
    }

    Car setCar(Car car) {
        if (salary > car.value) {
            System.out.println("Rich man, you buy this car by cash ");
            this.car = car;


        } else if (salary > (car.value / 12)) {
            System.out.println("You can buy this car with credit. ");
            this.car = car;

        } else {
            System.out.println("Change job you poor man or go by foot everywhere ");


        }
        return car;
    }

    @Override
    public void sell(Human buyer, Human seller, Double price) {
        System.out.println("Cant sell human");


    }

    Double getSalary() {
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//        LocalDateTime now = LocalDateTime.now();
//        System.out.println("Informacja pobrane: " + dtf.format(now));
//        System.out.println("Wynagrodzenie wynosi: " + salary);
//        System.out.println();
        return salary;
    }

    void setSalary(Double salary) {
        if (salary <= 0) {

//            System.out.println("Za tyle to by Chińczyk nie pracował, ustaw wynagrodzenie na wyższym poziomie");
            System.out.println();
        } else {
            this.salary = salary;
//            System.out.println("Informacje o zmienie wynagrodzenia : " + salary + " zostały przekazane do systemu księgowego");
//            System.out.println("Wymagane jest odebranie aneksu do umowy od pani Hani z kadr");
//            System.out.println("Informacja o zmianie wypłaty na: " + salary + " została wyslana do ZUS oraz US");
//            System.out.println("Wszelkie próby utajnienia dochodu są karalne.");
            System.out.println();

        }
    }


    @Override
    public java.lang.String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", weight=" + weight +
                ", phone=" + phone +
                ", pet=" + pet +
                ", car=" + car +
                ", salary=" + salary +
                '}';
    }
}


