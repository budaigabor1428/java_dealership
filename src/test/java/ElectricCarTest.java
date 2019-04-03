import Components.Engine;
import Components.Tires;
import Vehicles.ElectricCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    public ElectricCar electricCar;
    public Engine engine;
    public Tires tires;

    @Before
    public void setup() {
        electricCar = new ElectricCar (25000, "Red", engine, tires);
        engine = new Engine("Apple", "Abc");
        tires = new Tires("Michellin", "Abc");

    }

    @Test
    public void hasPrice() {
        assertEquals(25000, electricCar.getPrice());
    }

    @Test
    public void hasColor() {
        assertEquals("Red", electricCar.getColors());
    }

    @Test
    public void hasEngine() {
        assertEquals("Apple", electricCar.getEngine().getMake());
    }

    @Test
    public void hasTires() {
        assertEquals("Michellin", electricCar.getTires().getMake());
    }
}
