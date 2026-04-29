package com.design_patterns.behavioral.observer;

public class DigitalClock implements Observer {
    @Override
    public void update(Subject subject) {
        if (subject instanceof ClockTimer) {
            ClockTimer timer = (ClockTimer) subject;
            System.out.printf("Digital: %02d:%02d:%02d%n",
                    timer.getHour(), timer.getMinute(), timer.getSecond());
        }
    }
}
