package device;

import com.company.Human;
import com.company.Salleable;

import java.util.jar.JarOutputStream;

public class Car extends Device implements Salleable {
    public double engineCapacity;
    public String color;
    public Double value;
    public Human owner;

    public Car() {

    }

    public Car(String producer, String model, Double engineCapacity) {
        super(producer, model);
        this.engineCapacity = engineCapacity;

    }

    public void sell(Human buyer, Human seller, Double price) {
        if (seller.car != null) {
            if (buyer.cash >= price) {
                buyer.car = seller.car;
                buyer.cash -= price;
                seller.cash += price;
                owner = buyer;
                seller.car = null;
                System.out.println("Car is sold");
                System.out.println("Old owner:" + seller);
                System.out.println("New owner : " + buyer);
            } else
                System.out.println("Not enought money sir");
        } else
            System.out.println("Human dont have a car");


    }

    @Override
    public void turnOn() {
        System.out.println("brum brum");
    }

    void wypisz() {
        System.out.println(model + " " + producer + " " + engineCapacity + " " + value);
    }


    @Override
    public java.lang.String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producent='" + producer + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", color='" + color + '\'' +
                ", value=" + value +
                ", year of production=" + yearOfProduction +
                '}';
    }

}

