package com.design_patterns.behavioral.strategy;

import java.util.List;

public class TeXCompositor implements Compositor {
    @Override
    public int[] compose(List<Integer> componentWidths, int lineWidth) {
        System.out.println("TeXCompositor: globally optimal break points");
        int total = componentWidths.stream().mapToInt(Integer::intValue).sum();
        int parts = Math.max(1, total / lineWidth);
        int[] breaks = new int[parts];
        for (int i = 0; i < parts; i++) {
            breaks[i] = (componentWidths.size() / (parts + 1)) * (i + 1);
        }
        return breaks;
    }
}
