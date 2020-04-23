package com.company;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Human {
    public String name;
    public String lastName;
    public Double weight;
    protected Phone phone;
    public Animal pet;
    public Car car;
    private Double salary = 2000.0;

    Double getSalary() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Informacja pobrane: " + dtf.format(now));
        System.out.println("Wynagrodzenie wynosi: " + salary);
        System.out.println();
        return salary;
    }

    void setSalary(double salary) {
        if (salary <= 0) {

            System.out.println("Za tyle to by Chińczyk nie pracował, ustaw wynagrodzenie na wyższym poziomie");
            System.out.println();
        } else {
            this.salary = salary;
            System.out.println("Informacje o zmienie wynagrodzenia : " + salary + " zostały przekazane do systemu księgowego");
            System.out.println("Wymagane jest odebranie aneksu do umowy od pani Hani z kadr");
            System.out.println("Informacja o zmianie wypłaty na: " + salary + " została wyslana do ZUS oraz US");
            System.out.println("Wszelkie próby utajnienia dochodu są karalne.");
            System.out.println();

        }
    }


}


