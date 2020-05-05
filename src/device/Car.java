package device;

public class Car {
    public final String model;
    public final String producent;
    public final double engineCapacity;
    public String color;
    public Double value;

    public Car(String model, String producent, Double engineCapacity) {
        this.model = model;
        this.producent = producent;
        this.engineCapacity = engineCapacity;


    }

    void wypisz() {
        System.out.println(model + " " + producent + " " + engineCapacity + " " + value);
    }


    @Override
    public java.lang.String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producent='" + producent + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", color='" + color + '\'' +
                ", value=" + value +
                '}';
    }

}

