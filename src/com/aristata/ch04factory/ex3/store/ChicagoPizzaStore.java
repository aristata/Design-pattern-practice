package com.aristata.ch04factory.ex3.store;

import com.aristata.ch04factory.ex1.PizzaType;
import com.aristata.ch04factory.ex3.factory.ChicagoPizzaIngredientFactory;
import com.aristata.ch04factory.ex3.factory.PizzaIngredientFactory;
import com.aristata.ch04factory.ex3.pizza.*;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (pizzaType == PizzaType.CHEESE) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");

        } else if (pizzaType == PizzaType.VEGGIE) {

            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");

        } else if (pizzaType == PizzaType.CLAM) {

            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");

        } else if (pizzaType == PizzaType.PEPPERONI) {

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");

        }
        return pizza;
    }
}
