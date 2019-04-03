import Components.Engine;
import Components.Tires;
import Vehicles.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    public Car car;
    public Engine engine;
    public Tires tires;

    @Before
    public void setup() {
        car = new Car (25000, "Red", engine, tires);
        engine = new Engine("Apple", "Abc");
        tires = new Tires("Michellin", "Abc");

    }

    @Test
    public void hasPrice() {
        assertEquals(25000, car.getPrice());
    }

    @Test
    public void hasColor() {
        assertEquals("Red", car.getColors());
    }

    @Test
    public void hasEngine() {
        assertEquals("Apple", car.getEngine().getMake());
    }

    @Test
    public void hasTires() {
        assertEquals("Michellin", car.getTires().getMake());
    }
}
