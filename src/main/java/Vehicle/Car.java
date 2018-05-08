package Vehicle;

import components.Door;
import components.Engine;

public class Car extends Vehicle {


    Door door;




    public Car(int price, String colour, String make, String module, Engine engine, Door door) {
        super(price, colour, make, module, engine);
        this.door = door;
    }

    public String start(){
        return "Car has started";
    }

    public Engine getEngine() {
        return engine;
    }


    public Door getDoor() {
        return door;
    }


    public void setDoor(Door door){
        this.door = door;
    }
    public int getNumberOfDoors(){
        return door.getNumberOfDoors();
    }

}
