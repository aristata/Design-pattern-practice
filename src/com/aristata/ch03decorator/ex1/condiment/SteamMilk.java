package com.aristata.ch03decorator.ex1.condiment;

import com.aristata.ch03decorator.ex1.coffee.Beverage;
import com.aristata.ch03decorator.ex1.coffee.BeverageSize;

public class SteamMilk extends CondimentDecorator {
    Beverage beverage;

    public SteamMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double condimentCost = 0.1;
        double cost = beverage.cost();
        return calculateSizeCost(beverage.getSize(), cost, condimentCost);
    }

    @Override
    public String getDescription() {
        StringBuilder sb = new StringBuilder(beverage.getDescription());
        return sb.append(", 스팀 밀크").toString();
    }

    @Override
    public BeverageSize getSize() {
        return beverage.getSize();
    }
}
