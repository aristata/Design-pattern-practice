package com.aristata.ch03decorator.ex3wiki;

public class VerticalScrollBarDecorator extends WindowDecorator {
    public VerticalScrollBarDecorator(Window window) {
        super(window);
    }

    @Override
    public void draw() {
        drawVerticalScrollBar();
        decoratedWindow.draw();
    }

    @Override
    public String getDescription() {
        return decoratedWindow.getDescription() + ", including vertical scrollbars";
    }

    private void drawVerticalScrollBar() {
        System.out.println("draw the vertical scrollbar");
    }
}
