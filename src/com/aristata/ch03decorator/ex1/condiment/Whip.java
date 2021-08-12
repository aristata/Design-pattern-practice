package com.aristata.ch03decorator.ex1.condiment;

import com.aristata.ch03decorator.ex1.coffee.Beverage;
import com.aristata.ch03decorator.ex1.coffee.BeverageSize;

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
    public BeverageSize getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        double condimentCost = 0.1;
        double cost = beverage.cost();
        return calculateSizeCost(beverage.getSize(), cost, condimentCost);
    }
}
