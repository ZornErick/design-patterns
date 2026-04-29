package com.design_patterns.behavioral.iterator;

public class Application {
    public static void main(String[] args) {
        List<String> employees = new List<>();
        employees.append("Alice");
        employees.append("Bob");
        employees.append("Carol");

        Iterator<String> it = employees.createIterator();
        for (it.first(); !it.isDone(); it.next()) {
            System.out.println(it.currentItem());
        }
    }
}
