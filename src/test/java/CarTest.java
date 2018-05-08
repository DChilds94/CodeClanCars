import Vehicle.Car;
import components.Door;
import components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class CarTest {

    Car car;
    Engine engine;
    Door door;


    @Before
    public void before(){
        Engine engine = new Engine("1.0L", 500);
        Door door = new Door(5);
        car = new Car(10000, "blue", "Ford", "Focus", engine, door);
    }

    @Test
    public void canGetPrice(){
        assertEquals(10000, car.getPrice(), 0.01);
    }
    @Test
    public void canGetColour(){
        assertEquals("blue", car.getColour());
    }
    @Test
    public void canGetMake(){
        assertEquals("Ford", car.getMake());
    }
    @Test
    public void canGetModel(){
        assertEquals("Focus", car.getModel());
    }
    @Test
    public void canStartEngine(){
        assertEquals("Car has started", car.start());
    }
    @Test
    public void canGetEngine(){
        Engine engine = new Engine("1.0L", 500);
        car.setEngine(engine);
        assertEquals("1.0L", car.getEngineCapacity());
    }
    @Test
    public void canGetHorsePower(){
        Engine engine = new Engine("1.0L", 500);
        car.setEngine(engine);
        assertEquals(500, car.getHorsePower());
    }
    @Test
    public void canGetDoors(){
        assertEquals(5, car.getNumberOfDoors());
    }
}
