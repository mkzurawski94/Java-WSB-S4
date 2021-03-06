package device;

import com.company.Human;
import com.company.Salleable;

public abstract class Device {

    public String producer;
    public int yearOfProduction;
    public String model;
    public Human owner;

    public Device(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    public Device() {

    }

    public abstract void turnOn();

    public java.lang.String toString() {
        return "Producent: " + producer +
                "Year of production: " + yearOfProduction +
                "model: " + model;

    }
}