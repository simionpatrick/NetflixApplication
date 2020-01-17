package VideoLibrary;


import java.time.LocalTime;
import java.util.ArrayList;

public class Serie {
    private ArrayList<Season> serie;
    private String serieName;

    public Serie(String serieName) {
        this.serieName = serieName;
        serie = new ArrayList<>();
    }

    public String toString() {
        return serieName;
    }

    public int getNumberOfSeasons() {
        return serie.size();
    }

    public void addSeason(Season season) {
        try {
            serie.add(season);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught!");
        }
    }

    public LocalTime getDurationPerSerie() {
        LocalTime totalTimePerSerie = LocalTime.of(0, 0, 0);

        for (Season season : serie) {
            totalTimePerSerie = totalTimePerSerie.plusHours(season.getTotalTimePerSeason().getHour()).plusMinutes(season.getTotalTimePerSeason().getMinute()).plusSeconds(season.getTotalTimePerSeason().getSecond());
        }
        return totalTimePerSerie;
    }

    public ArrayList<Season> getSerie() {
        return serie;
    }


}
