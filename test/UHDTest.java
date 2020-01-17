import Subscriptions.UHD;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UHDTest {

    @Test
    void getSubscriptionName() {
        UHD uhd = new UHD();
        assertEquals("Subscriptions.UHD", uhd.getSubscriptionName());
    }

    @Test
    void getSubscriptionCost() {
        UHD uhd = new UHD();
        assertEquals(13.99, uhd.getSubscriptionCost());
    }
}