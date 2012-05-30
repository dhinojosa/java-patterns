package org.abqjug.javapatterns.observer;

import java.io.File;

/**
 * @author John Ericksen
 */
public class ObserverDemonstration {

    public static void main(String[] args) {

        RSSFeed johnsFeed = new RSSFeed();

        johnsFeed.addObserver(new ConsoleOutObserver("Console 1"));
        RSSObserver console2 = johnsFeed.addObserver(new ConsoleOutObserver("Console 2"));
        johnsFeed.addObserver(new LoggingObserver(new File("/home/john/Desktop/rss.txt")));

        johnsFeed.broadcast(new RSSEntry("ABQJUG Rocks!"));

        johnsFeed.removeObserver(console2);

        johnsFeed.broadcast(new RSSEntry("ABQJUG Meeting Announcement"));
    }
}
