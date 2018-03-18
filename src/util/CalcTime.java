package util;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public final class CalcTime {
    private LocalTime start;

    private LocalTime stop;

    private long milis;

    private final String timePrefix;

    public CalcTime(String timePrefix) {
        this.timePrefix = timePrefix;
    }

    public CalcTime() {
        this.timePrefix = "Time:";
    }

    public void start() {
        this.start = LocalTime.now();
    }

    public void stop() {
        this.stop = LocalTime.now();
        if (start == null) {
            System.out.println("Clock timer did not start!");
        }
        this.milis = start != null ? ChronoUnit.MILLIS.between(this.start, this.stop) : 0;
    }

    public void display() {
        System.out.println("\n" + timePrefix + ": " + milis + " [ms]  (" + Math.round(milis / 1000) + " [s])");
    }

    public LocalTime getStart() {
        return start;
    }

    public LocalTime getStop() {
        return stop;
    }

    public long getMilis() {
        return milis;
    }
}
