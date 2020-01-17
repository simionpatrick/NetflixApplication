package VideoLibrary;

import Personal.Profile;
import VideoLibrary.Watchable;

import java.util.ArrayList;
import java.util.HashMap;

public class WatchList {
    private HashMap<Profile, ArrayList<Watchable>> watchList;

    public WatchList() {
        watchList = new HashMap<>();
    }

    public void addProfile(Profile profile) {
        watchList.put(profile, new ArrayList<Watchable>());
    }

    public void addVideo(Profile profile, Watchable video) {
        for (Profile profiles : watchList.keySet()) {
            if (profiles.getProfileName() == profile.getProfileName()) {
                watchList.get(profiles).add(video);
            }
        }
    }

    public void giveLike(String videoName) {
        for (ArrayList<Watchable> video : watchList.values()) {
            for (Watchable watchable : video) {
                if (watchable.getName() == videoName) {
                    watchable.giveLike();
                }
            }
        }
    }

    public void giveDislike(String videoName) {
        for (ArrayList<Watchable> video : watchList.values()) {
            for (Watchable watchable : video) {
                if (watchable.getName() == videoName) {
                    watchable.giveDislike();
                }
            }
        }
    }

    public HashMap<Profile, ArrayList<Watchable>> getWatchList() {
        return watchList;
    }
}
