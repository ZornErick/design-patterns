package com.design_patterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class Composition {
    private Compositor compositor;
    private List<Integer> componentWidths = new ArrayList<>();
    private int lineWidth;

    public Composition(Compositor compositor, int lineWidth) {
        this.compositor = compositor;
        this.lineWidth = lineWidth;
    }

    public void setCompositor(Compositor compositor) {
        this.compositor = compositor;
    }

    public void insert(int width) {
        componentWidths.add(width);
    }

    public void repair() {
        int[] breaks = compositor.compose(componentWidths, lineWidth);
        System.out.print("Break points: [");
        for (int i = 0; i < breaks.length; i++) {
            System.out.print(breaks[i]);
            if (i < breaks.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
