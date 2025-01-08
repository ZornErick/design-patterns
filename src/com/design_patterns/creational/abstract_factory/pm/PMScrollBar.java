package com.design_patterns.creational.abstract_factory.pm;

import com.design_patterns.creational.abstract_factory.ScrollBar;

public class PMScrollBar implements ScrollBar {
    @Override
    public void paint() {
        System.out.println("You have created PMScrollBar.");
    }
}
