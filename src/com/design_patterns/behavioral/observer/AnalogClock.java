package com.design_patterns.behavioral.observer;

public class AnalogClock implements Observer {
    @Override
    public void update(Subject subject) {
        if (subject instanceof ClockTimer) {
            ClockTimer timer = (ClockTimer) subject;
            System.out.println("Analog: pointers moved to " + timer.getHour() + "h " + timer.getMinute() + "m");
        }
    }
}
