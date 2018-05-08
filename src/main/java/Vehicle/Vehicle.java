package Vehicle;

public abstract class Vehicle {

    private double price;
    private String colour;
    private String make;
    private String model;

    public Vehicle(int price, String colour, String make, String model) {
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
}
