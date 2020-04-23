package com.company;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Human {
    public String name;
    public String lastName;
    public Double weight;
    protected Phone phone;
    public Animal pet;
    private Car car;
    private Double salary = 2000.0;

    public Car getCar() {
        System.out.println(name + " " + lastName + " have: " + car.model + " " + car.producent);
        return car;
    }

    Car setCar(Car car) {
        if (salary > car.value) {
            System.out.println("Rich man, you buy this car by cash");
            this.car = car;


        } else if (salary > (car.value / 12)) {
            System.out.println("You can buy this car with credit.");
            this.car = car;

        } else {
            System.out.println("Change job you poor man or go by foot everywhere");


        }
        return car;
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


}


