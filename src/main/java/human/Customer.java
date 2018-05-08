package human;

import Vehicle.Car;

public class Customer {

    private String name;
    private double cash;

    public Customer(String name, double cash) {
        this.name = name;
        this.cash = cash;
    }

    public String getName() {
        return name;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public void buyCar(Car car){
        this.cash -= car.getPrice();
    }
}
