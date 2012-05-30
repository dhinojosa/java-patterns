package org.abqjug.javapatterns.observer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author John Ericksen
 */
public class LoggingObserver implements RSSObserver {

    private FileWriter log;

    public LoggingObserver(File log) {
        try {
            this.log = new FileWriter(log);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void update(RSSEntry entry) {

        try {
            log.write(entry.getValue());
            log.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
