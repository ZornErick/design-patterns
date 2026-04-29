package com.design_patterns.structural.flyweight;

public class Application {
    public static void main(String[] args) {
        GlyphFactory factory = new GlyphFactory();
        String text = "abracadabra";

        for (int i = 0; i < text.length(); i++) {
            Glyph glyph = factory.getCharacter(text.charAt(i));
            glyph.draw(new GlyphContext(0, i, "Times"));
        }

        System.out.println("Distinct flyweights created: " + factory.size());
    }
}
