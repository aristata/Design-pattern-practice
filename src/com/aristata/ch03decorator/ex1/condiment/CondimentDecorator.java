package com.aristata.ch03decorator.ex1.condiment;

import com.aristata.ch03decorator.ex1.coffee.Beverage;

public abstract class CondimentDecorator extends Beverage { // (1)
    public abstract String getDescription(); // (2)

    /*
     *  (1) Beverage 객체가 들어갈 자리에 들어 갈 수 있어야 하므로 Beverage 클래스를 확장한다
     *  (2) 모든 첨가물(condiment) 데코레이터에서 getDescription 메소드를 새로 구현하도록 할 계획이기 때문에
     *      추상 메소드로 선언함
     */
}
