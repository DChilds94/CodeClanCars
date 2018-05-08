package Vehicle;

import actions.Startable;

public class MotorBike extends Vehicle implements Startable {

    public MotorBike(int price, String colour, String make, String module) {
        super(price, colour, make, module);
    }

    public String start(){
        return "Bike has started";
    }
}
