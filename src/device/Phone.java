package device;

import com.company.Human;
import com.company.Salleable;

public class Phone extends Device implements Salleable {
    public Double screenSize;
    public Human owner;


    public Phone() {

    }

    public Phone(String producer, String model, Double screenSize) {
        super(producer, model);
        this.screenSize = screenSize;


    }

    @Override
    public void sell(Human buyer, Human seller, Double price) {
        if (seller.phone != null) {
            if (buyer.cash >= price) {
                buyer.phone = seller.phone;
                buyer.cash -= price;
                seller.cash += price;
                owner = buyer;
                seller.phone = null;
                System.out.println("Phone is sold");
                System.out.println("Old owner:" + seller);
                System.out.println("New owner : " + buyer);
            } else
                System.out.println("Not enought money sir");
        } else
            System.out.println("Human dont have a phone");


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
