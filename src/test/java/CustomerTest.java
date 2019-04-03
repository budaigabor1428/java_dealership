import People.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    public Customer customer;

    @Before
    public void setup () {
        customer = new Customer ("John Smith", 25000);
    }

    @Test
    public void hasName() {
        assertEquals("John Smith", customer.getName());
    }

    @Test
    public void hasMoney() {
        assertEquals(25000, customer.getMoney());
    }

    @Test
    public void canGiveMoney() {
        int amount = customer.giveMoney(100);
        assertEquals(100, amount);
    }

    @Test
    public void cantGiveTooMuchMoney() {
        int amount = customer.giveMoney(100000);
        assertEquals(0, amount);
    }

}
