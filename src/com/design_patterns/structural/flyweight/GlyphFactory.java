package com.design_patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class GlyphFactory {
    private Map<java.lang.Character, Glyph> pool = new HashMap<>();

    public Glyph getCharacter(char symbol) {
        return pool.computeIfAbsent(symbol, Character::new);
    }

    public int size() {
        return pool.size();
    }
}
