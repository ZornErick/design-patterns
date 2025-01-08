package com.design_patterns.creational.abstract_factory.motif;

import com.design_patterns.creational.abstract_factory.ScrollBar;
import com.design_patterns.creational.abstract_factory.WidgetFactory;
import com.design_patterns.creational.abstract_factory.Window;

public class MotifWidgetFactory implements WidgetFactory {
    @Override
    public ScrollBar createScrollBar() {
        return new MotifScrollBar();
    }

    @Override
    public Window createWindow() {
        return new MotifWindow();
    }
}
