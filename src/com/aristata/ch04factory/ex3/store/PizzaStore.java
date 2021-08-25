package com.aristata.ch04factory.ex3.store;

import com.aristata.ch04factory.ex1.PizzaType;
import com.aristata.ch04factory.ex3.pizza.Pizza;

/*  PizzaStore 클래스를 추상 클래스로 변경하였다 */
public abstract class PizzaStore {

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = createPizza(type); /* 팩토리 객체가 아닌 PizzaStore 에 있는 createPizza 메소드를 사용하도록 수정 */
        System.out.println("---------- Making a " + pizza.getName() + " ----------");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(PizzaType pizzaType);
}
