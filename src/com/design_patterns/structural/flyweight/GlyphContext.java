package com.design_patterns.structural.flyweight;

public class GlyphContext {
    private int row;
    private int column;
    private String font;

    public GlyphContext(int row, int column, String font) {
        this.row = row;
        this.column = column;
        this.font = font;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public String getFont() {
        return font;
    }
}
