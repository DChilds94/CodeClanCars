package components;

public class Engine {

    private String engineCapacity;
    private int horsePower;

    public Engine(String engineCapacity, int horsePower) {
        this.engineCapacity = engineCapacity;
        this.horsePower = horsePower;
    }

    public String getEngineCapacity() {
        return engineCapacity;
    }

    public int getHorsePower() {
        return horsePower;
    }
}
