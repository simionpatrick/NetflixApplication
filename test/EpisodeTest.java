import VideoLibrary.Episode;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class EpisodeTest {

    @org.junit.jupiter.api.Test
    void getName() {
        Episode episode = new Episode("ep1", true,1,20,30,"D:/location", "D:/location");
        assertEquals("ep1", episode.getName());
    }

    @org.junit.jupiter.api.Test
    void getDuration() {
        Episode episode = new Episode("ep1", true,1,20,30,"D:/location", "D:/location");
        assertEquals(LocalTime.of(01,20,30), episode.getDuration());
    }

    @org.junit.jupiter.api.Test
    void getLocation() {
        Episode episode = new Episode("ep1", true,1,20,30,"D:/location", "D:/location");
        assertEquals("D:/location", episode.getLocation());
    }

    @org.junit.jupiter.api.Test
    void getImageURL() {
        Episode episode = new Episode("ep1", true,1,20,30,"D:/location", "D:/location");
        assertEquals("D:/location", episode.getImageURL());

    }

    @org.junit.jupiter.api.Test
    void changeSponsorShip() {
        Episode episode = new Episode("ep1", true,1,20,30,"D:/location", "D:/location");
        episode.changeSponsorShip(false);
        assertEquals(false, episode.getSponsorship());
    }
}