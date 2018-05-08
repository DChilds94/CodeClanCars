package Vehicle;

import actions.Startable;
import components.Door;
import components.Engine;

public abstract class Vehicle implements Startable {

    Engine engine;
    private double price;
    private String colour;
    private String make;
    private String model;

    public Vehicle(int price, String colour, String make, String model, Engine engine) {

        this.engine = engine;
        this.price = price;
        this.colour = colour;
        this.make = make;
        this.model = model;

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
    public String getEngineCapacity(){
        return engine.getEngineCapacity();
    }
    public int getHorsePower(){
        return engine.getHorsePower();
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
