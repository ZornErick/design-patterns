package com.design_patterns.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private Map<String, Boolean> variables = new HashMap<>();

    public void assign(String name, boolean value) {
        variables.put(name, value);
    }

    public boolean lookup(String name) {
        return variables.getOrDefault(name, false);
    }
}
