package com.aristata.ch03decorator.ex3wiki;

public class SimpleWindow implements Window {
    @Override
    public void draw() {
        System.out.println(this.getDescription() + " draw()");
    }

    @Override
    public String getDescription() {
        return "simple window";
    }
}
