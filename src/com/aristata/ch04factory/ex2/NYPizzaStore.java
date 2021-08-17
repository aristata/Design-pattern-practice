package com.aristata.ch04factory.ex2;

import com.aristata.ch04factory.ex1.PizzaType;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(PizzaType pizzaType) {
        if (pizzaType == PizzaType.CHEESE) {
            return new NYStyleCheesePizza();
        } else if (pizzaType == PizzaType.VEGGIE) {
            return new NYStyleVeggiePizza();
        } else if (pizzaType == PizzaType.CLAM) {
            return new NYStyleClamPizza();
        } else if (pizzaType == PizzaType.PEPPERONI) {
            return new NYStylePepperoniPizza();
        } else return null;
    }
}
