package device;

public class Phone extends Device {
    public Double screenSize;

    public Phone() {

    }

    public Phone(String producer, String model, Double screenSize) {
        super(producer, model);
        this.screenSize = screenSize;


    }

    @Override
    public void turnOn() {
        System.out.println("beeep-beeep-beeep");
    }

    @Override
    public java.lang.String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", screenSize=" + screenSize +
                '}';
    }
}
