package com.design_patterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class SimpleCompositor implements Compositor {
    @Override
    public int[] compose(List<Integer> componentWidths, int lineWidth) {
        System.out.println("SimpleCompositor: line-by-line");
        List<Integer> breaks = new ArrayList<>();
        int current = 0;
        for (int i = 0; i < componentWidths.size(); i++) {
            current += componentWidths.get(i);
            if (current > lineWidth) {
                breaks.add(i);
                current = componentWidths.get(i);
            }
        }
        return breaks.stream().mapToInt(Integer::intValue).toArray();
    }
}
