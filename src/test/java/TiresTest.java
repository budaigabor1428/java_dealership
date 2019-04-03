import Components.Tires;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TiresTest {

    public Tires tires;

    @Before
    public void setup() {
        tires = new Tires("Michellin", "Abc");
    }

    @Test
    public void canGetMake() {
        assertEquals("Michellin", tires.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("Abc", tires.getModel());
    }
}
