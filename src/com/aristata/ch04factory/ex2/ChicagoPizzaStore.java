package com.aristata.ch04factory.ex2;

import com.aristata.ch04factory.ex1.PizzaType;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        if (pizzaType == PizzaType.CHEESE) {
            return new ChicagoStyleCheesePizza();
        } else if (pizzaType == PizzaType.CLAM) {
            return new ChicagoStyleClamPizza();
        } else if (pizzaType == PizzaType.VEGGIE) {
            return new ChicagoStyleVeggiePizza();
        } else if (pizzaType == PizzaType.PEPPERONI) {
            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}
