package com.aristata.ch03decorator.ex3wiki;

abstract class WindowDecorator implements Window {
    Window decoratedWindow;

    public WindowDecorator(Window window) {
        this.decoratedWindow = window;
    }
}
