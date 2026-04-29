package com.design_patterns.behavioral.observer;

public class ClockTimer extends Subject {
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void tick(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        notifyObservers();
    }
}
