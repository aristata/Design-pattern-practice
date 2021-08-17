package com.aristata.ch03decorator.ex3wiki;

public class HorizontalScrollBarDecorator extends WindowDecorator {
    public HorizontalScrollBarDecorator(Window window) {
        super(window);
    }

    @Override
    public void draw() {
        drawHorizontalScrollBar();
        decoratedWindow.draw();
    }

    @Override
    public String getDescription() {
        return decoratedWindow.getDescription() + ", including horizontal scrollbars";
    }

    private void drawHorizontalScrollBar() {
        System.out.println("draw the horizontal scrollbar");
    }
}
