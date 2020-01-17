import VideoLibrary.Episode;
import VideoLibrary.Season;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class SeasonTest {

    @Test
    void getSeasonName() {
        Season season = new Season("s1");
        assertEquals("s1", season.toString());
    }

    @Test
    void getNumberOfEpisodes() {
        Season season = new Season("s1");
        Episode episode = new Episode("ep1", true,1,20,30,"D:/location", "D:/location");
        Episode episode2 = new Episode("ep1", true,1,20,30,"D:/location", "D:/location");
        Episode episode3 = new Episode("ep1", true,1,20,30,"D:/location", "D:/location");
        season.addEpisode(episode);
        season.addEpisode(episode2);
        season.addEpisode(episode3);
        assertEquals(3, season.getNumberOfEpisodes());
    }

    @Test
    void addEpisode() {
        Season season = new Season("s1");
        Episode episode = new Episode("ep1", true,1,20,30,"D:/location", "D:/location");
        Episode episode2 = new Episode("ep1", true,1,20,30,"D:/location", "D:/location");
        Episode episode3 = new Episode("ep1", true,1,20,30,"D:/location", "D:/location");
        season.addEpisode(episode);
        season.addEpisode(episode2);
        season.addEpisode(episode3);
        assertEquals(3, season.getNumberOfEpisodes());
    }

    @Test
    void getTotalTimePerSeason() {
        Season season = new Season("s1");
        Episode episode = new Episode("ep1", true,1,20,30,"D:/location", "D:/location");
        Episode episode2 = new Episode("ep1", true,1,20,30,"D:/location", "D:/location");
        Episode episode3 = new Episode("ep1", true,1,20,30,"D:/location", "D:/location");
        season.addEpisode(episode);
        season.addEpisode(episode2);
        season.addEpisode(episode3);
        assertEquals(LocalTime.of(4,1,30), season.getTotalTimePerSeason());
    }
}