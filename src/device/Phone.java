package device;

public class Phone {
    public String producer;
    public String model;
    public Double screenSize;

    @Override
    public java.lang.String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", screenSize=" + screenSize +
                '}';
    }
}
