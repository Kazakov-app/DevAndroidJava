package Practicum.b.SprintSecond;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;


class Scratch {

    public static ArrayList<HamsterFeed> filter(ArrayList<HamsterFeed> hamsterFeeds) {
        Iterator<HamsterFeed> iterator = hamsterFeeds.iterator();
        while (iterator.hasNext()) {
            HamsterFeed feed = iterator.next();
            if (!feed.isFresh) {
                iterator.remove();
            }
        }
        return hamsterFeeds;
    }
}


class HamsterFeed {

    final boolean isFresh;
    final int num;

    public HamsterFeed(final int num, final boolean isFresh) {
        this.isFresh = isFresh;
        this.num = num;
    }
}
