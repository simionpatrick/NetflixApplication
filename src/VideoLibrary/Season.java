package VideoLibrary;


import java.time.LocalTime;
import java.util.ArrayList;

public class Season {
    private ArrayList<Episode> season;
    private String seasonName;

    public Season(String seasonName) {
        this.seasonName = seasonName;
        season = new ArrayList<>();
    }

    public String toString() {
        return seasonName;
    }

    public int getNumberOfEpisodes() {
        return season.size();
    }

    public ArrayList<Episode> getSeason() {
        return season;
    }

    public void addEpisode(Episode episode) {
        try {
            season.add(episode);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException Caught!");
        }
    }

    public LocalTime getTotalTimePerSeason() {
        LocalTime totalTimePerSeason = LocalTime.of(0, 0, 0);
        for (Episode episode : season) {
            totalTimePerSeason = totalTimePerSeason.plusHours(episode.getDuration().getHour())
                    .plusMinutes(episode.getDuration().getMinute())
                    .plusSeconds(episode.getDuration().getSecond());
        }
        return totalTimePerSeason;
    }


}
