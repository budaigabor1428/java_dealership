import Components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    public Engine engine;

    @Before
    public void setup() {
       engine = new Engine("Apple", "Abc");
    }

    @Test
    public void canGetMake() {
        assertEquals("Apple", engine.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("Abc", engine.getModel());
    }
}
