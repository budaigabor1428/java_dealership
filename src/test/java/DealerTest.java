import People.Dealer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    private Dealer dealer;

    @Before
    public void setup() {
        dealer = new Dealer("joe");
    }

    @Test
    public void canGetName() {
        assertEquals("joe", dealer.getName());
    }

}
