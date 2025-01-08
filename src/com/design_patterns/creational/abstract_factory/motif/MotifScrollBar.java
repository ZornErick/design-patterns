package com.design_patterns.creational.abstract_factory.motif;

import com.design_patterns.creational.abstract_factory.ScrollBar;

public class MotifScrollBar implements ScrollBar {
    @Override
    public void paint() {
        System.out.println("You have created MotifScrollBar.");
    }
}
