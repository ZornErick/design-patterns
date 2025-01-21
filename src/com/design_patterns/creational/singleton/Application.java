package com.design_patterns.creational.singleton;

public class Application {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance(1);
        Singleton instance2 = Singleton.getInstance(2);

        System.out.println(instance1);
        System.out.println(instance2);
    }
}
