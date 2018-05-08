package Vehicle;

import components.Door;
import components.Engine;

public class Van extends Vehicle {

    Door door;

    public Van(int price, String colour, String make, String module, Engine engine, Door door) {
        super(price, colour, make, module, engine);
        this.door = door;

    }

    public String start(){
        return "Van has started";
    }
    public void setDoor(Door door){
        this.door = door;
    }
    public int getNumberOfDoors(){
        return door.getNumberOfDoors();
    }

}
