import Vehicle.MotorBike;
import Vehicle.Van;
import components.Door;
import components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VanTest {

    Door door;
    Engine engine;
    Van van;

    @Before
    public void before(){
        engine = new Engine("2.5L", 600);
        door = new Door(5);
        van = new Van(70000, "blue", "Mercedes", "Sprinter", engine, door);
    }

    @Test
    public void canGetPrice(){
        assertEquals(70000, van.getPrice(), 0.01);
    }
    @Test
    public void canGetColour(){
        assertEquals("blue", van.getColour());
    }
    @Test
    public void canGetMake(){
        assertEquals("Mercedes", van.getMake());
    }
    @Test
    public void canGetModel(){
        assertEquals("Sprinter", van.getModel());
    }
    @Test
    public void canStartEngine(){
        assertEquals("Van has started", van.start());
    }
    @Test
    public void canGetDoors(){
        assertEquals(5, van.getNumberOfDoors());
    }
}
