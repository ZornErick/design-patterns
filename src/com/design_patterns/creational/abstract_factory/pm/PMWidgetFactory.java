package com.design_patterns.creational.abstract_factory.pm;

import com.design_patterns.creational.abstract_factory.ScrollBar;
import com.design_patterns.creational.abstract_factory.WidgetFactory;
import com.design_patterns.creational.abstract_factory.Window;

public class PMWidgetFactory implements WidgetFactory {
    @Override
    public ScrollBar createScrollBar() {
        return new PMScrollBar();
    }

    @Override
    public Window createWindow() {
        return new PMWindow();
    }
}
