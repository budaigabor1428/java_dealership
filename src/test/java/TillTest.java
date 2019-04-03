import Till.Till;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TillTest {

    private Till till;

    @Before
    public void setup() {
        till = new Till(100);
    }

    @Test
    public void hasMoney() {
        assertEquals(100, till.showAmount());
    }

    @Test
    public void canReduceAmount() {
        till.takeMoney(10);
        assertEquals(90, till.showAmount());
    }

    @Test
    public void cantReduceAmount() {
        till.takeMoney(110);
        assertEquals(100, till.showAmount());
    }

    @Test
    public void canIncreaseAmount() {
        till.addMoney(10);
        assertEquals(110, till.showAmount());
    }
}
