package com.design_patterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class ArrayCompositor implements Compositor {
    private int interval;

    public ArrayCompositor(int interval) {
        this.interval = interval;
    }

    @Override
    public int[] compose(List<Integer> componentWidths, int lineWidth) {
        System.out.println("ArrayCompositor: regular intervals of " + interval);
        List<Integer> breaks = new ArrayList<>();
        for (int i = interval; i < componentWidths.size(); i += interval) {
            breaks.add(i);
        }
        return breaks.stream().mapToInt(Integer::intValue).toArray();
    }
}
