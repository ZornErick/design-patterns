package com.design_patterns.creational.prototype;

public class Application2 {
    public static void main(String[] args) {
        TableCache tableCache = new TableCache();

        System.out.println(tableCache.get("Rectangular Wood Table"));
        System.out.println(tableCache.get("Round Glass Table"));
    }
}
