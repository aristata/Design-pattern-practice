package com.aristata.ch03decorator.ex1.coffee;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "다크로스트 커피";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
