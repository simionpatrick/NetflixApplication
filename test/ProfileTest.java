import Personal.Profile;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfileTest {

    @Test
    void getProfileName() {
        Profile profile = new Profile("profile");
        assertEquals("profile",profile.getProfileName());
    }
}