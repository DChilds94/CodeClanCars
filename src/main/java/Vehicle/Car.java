package Vehicle;

import actions.Startable;

public class Car extends Vehicle implements Startable {



    public Car(int price, String colour, String make, String module) {
        super(price, colour, make, module);
    }

    public String start(){
        return "Car has started";
    }

}
