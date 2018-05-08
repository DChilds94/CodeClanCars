import Vehicle.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class CarTest {

    Car car;

    @Before
    public void before(){
        car = new Car(10000, "blue", "Ford", "Focus");
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
}
