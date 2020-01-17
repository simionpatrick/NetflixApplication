import Personal.Profile;
import Personal.User;
import Subscriptions.Subscription;
import Subscriptions.UHD;
import VideoLibrary.*;

public class main {

    public static void main(String args[])
    {
        Profile profile1 = new Profile("patrick");
        Profile profile2 = new Profile("tavi");
        User user1 = new User("kdloaskd", "me");
        user1.addProfile("patrick");
        Subscription subscription = new UHD();
        NetflixApp nf = new NetflixApp();
        nf.addUserWithSubscription(user1, subscription);
        nf.getUserInformation();
        //----------------------------------------------------
        WatchList watchList = new WatchList();
        Movie movie = new Movie("the shining", true, 1, 25, 30, "dsapljdlaskm", "djhysahgbdas");
        Movie movie2 = new Movie("the dying", true, 1, 25, 30, "dsapljdlaskm", "djhysahgbdas");
        Movie movie3 = new Movie("the reviving", true, 1, 25, 30, "dsapljdlaskm", "djhysahgbdas");
        Movie movie4 = new Movie("the ending", true, 1, 25, 30, "dsapljdlaskm", "djhysahgbdas");
        watchList.addProfile(profile1);
        watchList.addProfile(profile2);
        watchList.addVideo(profile1, movie);
        watchList.addVideo(profile1, movie2);
        watchList.addVideo(profile1, movie3);
        watchList.addVideo(profile2, movie);
        NetflixApp nf2 = new NetflixApp();
        nf2.addWatchlist(watchList);
        nf2.getVideosWatched();
        //-----------------------------------------------------
        nf2.getTotalDurationPerProfile();
        //----------------------------------------------------
        Episode ep1 = new Episode("the beginning", true, 0, 20, 30, "dsapljdlaskm", "djhysahgbdas");
        Episode ep2 = new Episode("the middle", true, 0, 21, 30, "dsapljdlaskm", "djhysahgbdas");
        Episode ep3 = new Episode("the almost end", true, 0, 17, 30, "dsapljdlaskm", "djhysahgbdas");
        Episode ep4 = new Episode("the end", true, 0, 39, 30, "dsapljdlaskm", "djhysahgbdas");
        Season s1 = new Season("S1");
        Season s2 = new Season("S2");
        s1.addEpisode(ep1);
        s1.addEpisode(ep2);
        s2.addEpisode(ep3);
        s2.addEpisode(ep4);
        Serie ser1 = new Serie("Breaking bad");
        ser1.addSeason(s1);
        ser1.addSeason(s2);
        NetflixApp netflixApp = new NetflixApp();
        netflixApp.addSerie(ser1);
        netflixApp.getDetailsAboutSerie();
        //-------------------------------------------------------
        WatchList wl = new WatchList();
        wl.addProfile(profile1);
        wl.addVideo(profile1, movie);
        wl.addVideo(profile1, movie2);
        wl.addVideo(profile1,ep1);
        wl.addVideo(profile1,ep2);
        wl.giveLike("the shining");
        wl.giveLike("the shining");
        wl.giveLike("the shining");
        wl.giveLike("the shining");
        wl.giveLike("the dying");
        wl.giveLike("the dying");
        wl.giveLike("the dying");
        wl.giveLike("the beginning");
        wl.giveLike("the beginning");
        wl.giveLike("the beginning");
        wl.giveLike("the middle");
        wl.giveLike("the middle");
        NetflixApp nfapp = new NetflixApp();
        nfapp.addWatchlist(wl);
        nfapp.getMostInterestingEpisode();
        nfapp.getMostInterestingMovie();
        nfapp.getMostBoringEpisode();
        nfapp.getMostBoringMovie();
    }
}
