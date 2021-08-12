package com.aristata.ch03decorator.ex1.condiment;

import com.aristata.ch03decorator.ex1.coffee.Beverage;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        StringBuilder sb = new StringBuilder(beverage.getDescription());
        return sb.append(", 휘핑 크림").toString();
    }

    @Override
    public double cost() {
        return 0.1 + beverage.cost();
    }
}
