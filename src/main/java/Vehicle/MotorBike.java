package Vehicle;

import actions.Startable;

import components.Engine;

public class MotorBike extends Vehicle{

    public MotorBike(int price, String colour, String make, String module, Engine engine) {
        super(price, colour, make, module, engine);
    }

    public String start(){
        return "Bike has started";
    }
}
