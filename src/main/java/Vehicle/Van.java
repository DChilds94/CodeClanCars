package Vehicle;

public class Van extends Vehicle {

    public Van(int price, String colour, String make, String module) {
        super(price, colour, make, module);
    }

    public String start(){
        return "Van has started";
    }
}
