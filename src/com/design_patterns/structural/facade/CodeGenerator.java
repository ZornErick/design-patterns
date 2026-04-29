package com.design_patterns.structural.facade;

public class CodeGenerator {
    public String generate(String ast) {
        System.out.println("Generating code from ast");
        return "bytecode";
    }
}
