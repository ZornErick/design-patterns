package com.design_patterns.creational.singleton;

public class Singleton {
    private final int number;
    private static Singleton instance;

    public Singleton(int number) {
        this.number = number;
    }

    public static Singleton getInstance(int number) {
        if (instance == null) {
            instance = new Singleton(number);
        }

        return instance;
    }

    @Override
    public String toString() {
        return "Singleton{" + "number=" + number + '}';
    }
}
