import Vehicle.MotorBike;
import Vehicle.Van;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VanTest {

    Van van;

    @Before
    public void before(){
        van = new Van(70000, "blue", "Mercedes", "Sprinter");
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
}
