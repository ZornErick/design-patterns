package com.design_patterns.structural.facade;

public class Scanner {
    public String scan(String source) {
        System.out.println("Scanning source");
        return "tokens";
    }
}
