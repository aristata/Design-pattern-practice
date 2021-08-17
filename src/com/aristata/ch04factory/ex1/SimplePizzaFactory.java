package com.aristata.ch04factory.ex1;

/**
 * 피자(객체)를 만드는 일을 전담하는 클래스
 */
public class SimplePizzaFactory {
    public Pizza createPizza(PizzaType pizzaType) {
        if (pizzaType == null) {
            return null;
        }

        Pizza pizza = null;

        switch (pizzaType) {
            case CLAM:
                pizza = new ClamPizza();
                break;
            case CHEESE:
                pizza = new CheesePizza();
                break;
            case PEPPERONI:
                pizza = new PepperoniPizza();
                break;
            case VEGGIE:
                pizza = new VeggiePizza();
                break;
        }

        return pizza;
    }
}
