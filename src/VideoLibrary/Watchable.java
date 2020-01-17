package VideoLibrary;

import java.time.LocalTime;

public interface Watchable {
    public abstract String getName();

    public abstract int getNumberLikes();

    public abstract LocalTime getDuration();

    public abstract void giveLike();

    public abstract void giveDislike();
}
