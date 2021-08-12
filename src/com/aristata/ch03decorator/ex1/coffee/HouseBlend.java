package com.aristata.ch03decorator.ex1.coffee;

public class HouseBlend extends Beverage { // (1)

    public HouseBlend() {
        description = "하우스 블렌드 커피";
    } // (2)

    @Override
    public double cost() {
        return .89;
    } // (3)

    /*
     * (1) Beverage 클래스를 확장한다
     * (2) 생성자에서 Beverage 로 부터 상속받은 description 변수의 값을 설정한다
     * (3) Beverage 클래스의 cost 메소드를 구현한다
     * */
}
