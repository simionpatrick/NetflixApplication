import VideoLibrary.Episode;
import VideoLibrary.Season;
import VideoLibrary.Serie;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class SerieTest {

    @Test
    void getSerieName() {
        Serie serie = new Serie("serie1");
        assertEquals("serie1", serie.toString());
    }

    @Test
    void getNumberOfSeasons() {
        Season season = new Season("s1");
        Season season2 = new Season("s2");
        Season season3 = new Season("s3");
        Serie serie = new Serie("serie1");
        serie.addSeason(season);
        serie.addSeason(season2);
        serie.addSeason(season3);
        assertEquals(3,serie.getNumberOfSeasons());

    }

    @Test
    void addSeason() {
        Season season = new Season("s1");
        Season season2 = new Season("s2");
        Season season3 = new Season("s3");
        Serie serie = new Serie("serie1");
        serie.addSeason(season);
        serie.addSeason(season2);
        serie.addSeason(season3);
        assertEquals(3,serie.getNumberOfSeasons());
    }

    @Test
    void getDurationPerSerie() {
        Season season = new Season("s1");
        Season season2 = new Season("s2");
        Episode episode = new Episode("ep1", true,1,20,30,"D:/location", "D:/location");
        Episode episode2 = new Episode("ep1", true,1,20,30,"D:/location", "D:/location");
        Episode episode3 = new Episode("ep1", true,1,20,30,"D:/location", "D:/location");
        season.addEpisode(episode);
        season.addEpisode(episode2);
        season2.addEpisode(episode3);
        Serie serie = new Serie("serie1");
        serie.addSeason(season);
        serie.addSeason(season2);
        assertEquals(LocalTime.of(4,1,30), serie.getDurationPerSerie());
    }
}