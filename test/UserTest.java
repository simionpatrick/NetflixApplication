import Personal.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void getEmail() {
        User user = new User("test@gmail.com", "pass");
        assertEquals("test@gmail.com", user.getEmail());
    }

    @Test
    void getPassword() {
        User user = new User("test@gmail.com", "pass");
        assertEquals("pass", user.getPassword());
    }

    @Test
    void getNumberOfProfiles() {
        User user = new User("test@gmail.com", "pass");
        user.addProfile("profile");
        assertEquals(1, user.getNumberOfProfiles());
    }

    @Test
    void addProfile() {
        User user = new User("test@gmail.com", "pass");
        user.addProfile("profile");
        assertEquals(1, user.getNumberOfProfiles());
    }
}