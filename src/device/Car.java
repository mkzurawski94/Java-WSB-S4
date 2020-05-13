package device;

import java.util.jar.JarOutputStream;

public class Car extends Device {
    public double engineCapacity;
    public String color;
    public Double value;

    public Car() {

    }

    public Car(String producer, String model, Double engineCapacity) {
        super(producer, model);
        this.engineCapacity = engineCapacity;

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

