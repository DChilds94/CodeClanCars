import Vehicle.Car;
import components.Door;
import components.Engine;
import human.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Engine engine;
    Door door;
    Car car;

    @Before
    public void before(){
        customer = new Customer("Nathan", 50000);
    }

    @Test
    public void canBuyCar(){
        car = new Car(45000, "Red", "Ford", "Focus", engine, door);
        customer.buyCar(car);
        assertEquals(5000, customer.getCash(), 0.01);
    }
}
