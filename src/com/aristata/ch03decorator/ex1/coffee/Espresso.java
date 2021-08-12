package com.aristata.ch03decorator.ex1.coffee;

public class Espresso extends Beverage { // (1)
    public Espresso() {
        description = "에스프레소"; // (2)
    }

    @Override
    public double cost() {
        return 1.99; // (3)
    }

    /*
     *  (1) Beverage 클래스를 확장
     *  (2) 클래스 생성자 부분에서 description 변수의 값을 설정한다
     *      description 이라는 인스턴스 변수는 Beverage 에서 상속받았다
     *  (3) 에스프레소 가격인 1.99를 리턴한다
     *      이 클래스에서는 첨가물 가격을 걱정할 필요가 없다
     */
}
