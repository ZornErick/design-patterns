package com.design_patterns.creational.abstract_factory.pm;

import com.design_patterns.creational.abstract_factory.Window;

public class PMWindow implements Window {
    @Override
    public void paint() {
        System.out.println("You have created PMWindow.");
    }
}
