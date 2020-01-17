package VideoLibrary;

import java.time.LocalTime;

public class Episode implements Watchable, Listable, Sponsorship {
    private String name;
    private int numberOfLikes;
    private boolean sponsored;
    private LocalTime duration;
    private String episodeLocation;
    private String episodeImageLocation;

    public Episode(String name, boolean sponsored, int hours, int minutes, int seconds, String episodeLocation, String episodeImageLocation) {
        this.name = name;
        this.sponsored = sponsored;
        this.duration = LocalTime.of(hours, minutes, seconds);
        this.episodeLocation = episodeLocation;
        this.episodeImageLocation = episodeImageLocation;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }

    public int getNumberLikes() {
        return numberOfLikes;
    }

    public LocalTime getDuration() {
        return duration;
    }

    public String getLocation() {
        return episodeLocation;
    }

    public String getImageURL() {
        return episodeImageLocation;
    }

    public void giveLike() {
        if (sponsored == true) {
            numberOfLikes = numberOfLikes + 2;
        } else {
            numberOfLikes = numberOfLikes + 1;
        }
    }

    public void giveDislike() {
        numberOfLikes = numberOfLikes - 1;
    }

    public void changeSponsorShip(boolean sponsored) {
        this.sponsored = sponsored;
    }

    public boolean getSponsorship() {
        return sponsored;
    }


}
