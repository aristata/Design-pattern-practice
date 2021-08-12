package com.aristata.ch03decorator.ex1.condiment;

import com.aristata.ch03decorator.ex1.coffee.Beverage;

public class Mocha extends CondimentDecorator { // (1)
    Beverage beverage; // (2)

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    } // (3)

    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    } // (4)

    @Override
    public String getDescription() {
        StringBuilder sb = new StringBuilder();
        return sb.append(beverage.getDescription())
                .append(", 모카")
                .toString();
    } // (5)

    /*
     * (1) Mocha 는 첨가물이기 때문에 CondimentDecorator 를 확장한다.
     * (2) 감싸고자 하는 음료를 저장하기 위한 인스턴스 변수
     * (3) 데코레이터의 생성자에 감싸고자 하는 음료 객체를 전달받아 인스턴스 변수에 할당한다.
     * (4) 음료가격에 모카를 추가한 가격을 계산해야 한다.
     * (5) 음료이름뒤에 첨가물을 붙여서 새로운 description 을 반환하도록 메소드를 구현한다 */
}
