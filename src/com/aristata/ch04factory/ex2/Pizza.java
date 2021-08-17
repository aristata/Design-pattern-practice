package com.aristata.ch04factory.ex2;

import java.util.ArrayList;
import java.util.List;

import static com.aristata.ch04factory.ex1.Pizza.makeStringMessage;

abstract public class Pizza {
    public String name;
    public String dough;
    public String sauce;
    public List<String> toppings = new ArrayList<>();

    public String getName() {
        return name;
    }

    void prepare() {
        System.out.println("Prepare " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (String topping : toppings) {
            System.out.println("   " + topping);
        }
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cut the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    @Override
    public String toString() {
        return makeStringMessage(name, dough, sauce, toppings);
    }


}
