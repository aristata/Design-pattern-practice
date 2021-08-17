package com.aristata.ch04factory.ex1;

import java.util.ArrayList;
import java.util.List;

abstract public class Pizza {

    public String name;

    public String dough;

    public String sauce;

    public List<String> toppings = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }

    @Override
    public String toString() {
        return makeStringMessage(name, dough, sauce, toppings);
    }

    public static String makeStringMessage(String name, String dough, String sauce, List<String> toppings) {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        display.append("---------------");
        return display.toString();
    }
}
