package com.design_patterns.behavioral.observer;

public class Application {
    public static void main(String[] args) {
        ClockTimer timer = new ClockTimer();
        timer.attach(new DigitalClock());
        timer.attach(new AnalogClock());

        timer.tick(10, 30, 0);
        timer.tick(10, 30, 1);
    }
}
