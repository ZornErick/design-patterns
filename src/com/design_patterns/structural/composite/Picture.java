package com.design_patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Picture implements Graphic {
    private List<Graphic> children = new ArrayList<>();

    @Override
    public void draw() {
        for (Graphic child : children) {
            child.draw();
        }
    }

    @Override
    public void add(Graphic graphic) {
        children.add(graphic);
    }

    @Override
    public void remove(Graphic graphic) {
        children.remove(graphic);
    }

    @Override
    public Graphic getChild(int index) {
        return children.get(index);
    }
}
