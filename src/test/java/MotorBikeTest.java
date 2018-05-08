import Vehicle.Car;
import Vehicle.MotorBike;
import components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MotorBikeTest {

    Engine engine;
    MotorBike motorBike;

    @Before
    public void before(){
        motorBike = new MotorBike (50000, "blue", "Kawkski", "Ninja", engine);
    }

    @Test
    public void canGetPrice(){
        assertEquals(50000, motorBike.getPrice(), 0.01);
    }
    @Test
    public void canGetColour(){
        assertEquals("blue", motorBike.getColour());
    }
    @Test
    public void canGetMake(){
        assertEquals("Kawkski", motorBike.getMake());
    }
    @Test
    public void canGetModel(){
        assertEquals("Ninja", motorBike.getModel());
    }
    @Test
    public void canStartEngine(){
        assertEquals("Bike has started", motorBike.start());
    }

}
