package com.design_patterns.structural.flyweight;

public class Character implements Glyph {
    private char symbol;

    public Character(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public void draw(GlyphContext context) {
        System.out.println("Drawing '" + symbol + "' at row " + context.getRow()
                + ", column " + context.getColumn() + " using font " + context.getFont());
    }
}
