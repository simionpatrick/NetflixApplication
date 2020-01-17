import Personal.Profile;
import Personal.User;
import Subscriptions.Subscription;
import VideoLibrary.*;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;

public class NetflixApp {
    private HashMap<User, Subscription> userInformation;
    private ArrayList<WatchList> videoWatchList;
    private ArrayList<Serie> series;
    private ArrayList<Listable> listables;

    public NetflixApp() {
        userInformation = new HashMap<>();
        videoWatchList = new ArrayList<>();
        series = new ArrayList<>();
        listables = new ArrayList<>();
    }

    public void addUserWithSubscription(User user, Subscription subscription) {
        userInformation.put(user, subscription);
    }

    public void getUserInformation() {
        for (User user : userInformation.keySet()) {
            System.out.println("The user: " + user.getEmail() + " has " + user.getNumberOfProfiles() + " profiles, the subscription type is: "
                    + userInformation.get(user).getSubscriptionName() + ", which costs " + userInformation.get(user).getSubscriptionCost());
        }
    }

    public void addWatchlist(WatchList watchlist) {
        videoWatchList.add(watchlist);
    }

    public void getVideosWatched() {
        for (WatchList video : videoWatchList) {
            for (Profile profile : video.getWatchList().keySet()) {
                System.out.println("The profile: " + profile.getProfileName() + " has watched the videos: ");
                for (Watchable watchableVideo : video.getWatchList().get(profile)) {
                    System.out.println(watchableVideo.getName());
                }
            }
        }
    }

    public void getTotalDurationPerProfile() {
        LocalTime totalDuration = LocalTime.of(00, 00, 00);
        for (WatchList watchList : videoWatchList) {
            for (Profile profile : watchList.getWatchList().keySet()) {
                System.out.println("The profile: " + profile.getProfileName() + " has watched a total of: ");
                for (Watchable video : watchList.getWatchList().get(profile)) {
                    totalDuration = totalDuration.plusHours(video.getDuration().getHour()).plusMinutes(video.getDuration().getMinute()).plusSeconds(video.getDuration().getSecond());
                }
                System.out.println(totalDuration);
            }
        }
    }

    public void addSerie(Serie serie) {
        series.add(serie);
    }

    public void getDetailsAboutSerie() {
        for (Serie serie : series) {
            System.out.println("The serie: " + serie + " contains the following seasons: ");
            for (Season seasonName : serie.getSerie()) {
                System.out.println(seasonName + ", which contains the episodes: ");
                for (Episode episode : seasonName.getSeason()) {
                    System.out.println(episode.getName());
                }
                System.out.println("The total time of the season is:" + seasonName.getTotalTimePerSeason());
            }
            System.out.println("The total time of the serie is: " + serie.getDurationPerSerie());
        }
    }

    public void addListable(Listable listable) {
        listables.add(listable);
    }

    public void listAllVideos() {
        for (Listable listableVideo : listables) {
            System.out.println(listableVideo.getLocation() + ", " + listableVideo.getImageURL());
        }
    }

    public void getMostInterestingMovie() {
        int max = 0;
        String mostInterestingVideo = " ";
        for (WatchList watchList : videoWatchList) {
            for (Profile profile : watchList.getWatchList().keySet()) {
                for (Watchable watchable : watchList.getWatchList().get(profile)) {
                    if (watchable instanceof Movie && watchable.getNumberLikes() > max) {
                        max = watchable.getNumberLikes();
                        mostInterestingVideo = watchable.getName();
                    }
                }
            }
        }
        System.out.println("The most interesting movie is: " + mostInterestingVideo + ", with " + max + " likes");
    }

    public void getMostInterestingEpisode() {
        int max = 0;
        String mostInterestingVideo = " ";
        for (WatchList watchList : videoWatchList) {
            for (Profile profile : watchList.getWatchList().keySet()) {
                for (Watchable watchable : watchList.getWatchList().get(profile)) {
                    if (watchable instanceof Episode && watchable.getNumberLikes() > max) {
                        max = watchable.getNumberLikes();
                        mostInterestingVideo = watchable.getName();
                    }
                }
            }
        }
        System.out.println("The most interesting episode is: " + mostInterestingVideo + ", with " + max + " likes");
    }

    public void getMostBoringMovie() {
        int min = 10000000;
        String mostBoringVideo = " ";
        for (WatchList watchList : videoWatchList) {
            for (Profile profile : watchList.getWatchList().keySet()) {
                for (Watchable watchable : watchList.getWatchList().get(profile)) {
                    if (watchable instanceof Movie && watchable.getNumberLikes() < min) {
                        min = watchable.getNumberLikes();
                        mostBoringVideo = watchable.getName();
                    }
                }
            }
        }
        System.out.println("The most boring movie is: " + mostBoringVideo + ", with " + min + " likes");
    }

    public void getMostBoringEpisode() {
        int min = 10000000;
        String mostBoringVideo = " ";
        for (WatchList watchList : videoWatchList) {
            for (Profile profile : watchList.getWatchList().keySet()) {
                for (Watchable watchable : watchList.getWatchList().get(profile)) {
                    if (watchable instanceof Episode && watchable.getNumberLikes() < min) {
                        min = watchable.getNumberLikes();
                        mostBoringVideo = watchable.getName();
                    }
                }
            }
        }
        System.out.println("The most boring episode is: " + mostBoringVideo + ", with " + min + " likes");
    }
}
