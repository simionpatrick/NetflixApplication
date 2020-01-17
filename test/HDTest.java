import Subscriptions.HD;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HDTest {

    @Test
    void getSubscriptionName() {
        HD hd = new HD();
        assertEquals("Subscriptions.HD", hd.getSubscriptionName());
    }

    @Test
    void getSubscriptionCost() {
        HD hd = new HD();
        assertEquals(10.99, hd.getSubscriptionCost());
    }
}