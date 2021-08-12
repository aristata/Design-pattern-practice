package com.aristata.ch03decorator.ex1.condiment;

import com.aristata.ch03decorator.ex1.coffee.Beverage;
import com.aristata.ch03decorator.ex1.coffee.BeverageSize;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double condimentCost = 0.15;
        double cost = beverage.cost();
        return calculateSizeCost(beverage.getSize(), cost, condimentCost);
    }

    @Override
    public String getDescription() {
        StringBuilder sb = new StringBuilder(beverage.getDescription());
        return sb.append(", 두유").toString();
    }

    @Override
    public BeverageSize getSize() {
        return beverage.getSize();
    }
}
