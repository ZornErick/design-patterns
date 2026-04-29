package com.design_patterns.behavioral.strategy;

import java.util.List;

public interface Compositor {
    int[] compose(List<Integer> componentWidths, int lineWidth);
}
