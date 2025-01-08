package com.design_patterns.creational.abstract_factory.motif;

import com.design_patterns.creational.abstract_factory.Window;

public class MotifWindow implements Window {
    @Override
    public void paint() {
        System.out.println("You have created MotifWindow.");
    }
}
