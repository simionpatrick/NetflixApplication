import Subscriptions.SD;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SDTest {

    @Test
    void getSubscriptionName() {
        SD sd = new SD();
        assertEquals("Subscriptions.SD", sd.getSubscriptionName());
    }

    @Test
    void getSubscriptionCost() {
        SD sd = new SD();
        assertEquals(7.99, sd.getSubscriptionCost());
    }
}