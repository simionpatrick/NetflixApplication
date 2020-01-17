import VideoLibrary.Movie;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    @org.junit.jupiter.api.Test
    void getName() {
        Movie movie = new Movie("ep1", true,1,20,30,"D:/location", "D:/location");
        assertEquals("ep1", movie.getName());
    }

    @org.junit.jupiter.api.Test
    void getDuration() {
        Movie movie = new Movie("ep1", true,1,20,30,"D:/location", "D:/location");
        assertEquals(LocalTime.of(01,20,30), movie.getDuration());
    }

    @org.junit.jupiter.api.Test
    void getLocation() {
        Movie movie = new Movie("ep1", true,1,20,30,"D:/location", "D:/location");
        assertEquals("D:/location", movie.getLocation());
    }

    @org.junit.jupiter.api.Test
    void getImageURL() {
        Movie movie = new Movie("ep1", true,1,20,30,"D:/location", "D:/location");
        assertEquals("D:/location", movie.getImageURL());

    }

    @org.junit.jupiter.api.Test
    void changeSponsorShip() {
        Movie movie = new Movie("ep1", true,1,20,30,"D:/location", "D:/location");
        movie.changeSponsorShip(false);
        assertEquals(false, movie.getSponsorship());
    }
}