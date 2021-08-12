package com.aristata.ch03decorator.ex1;

import com.aristata.ch03decorator.ex1.coffee.Beverage;
import com.aristata.ch03decorator.ex1.coffee.DarkRoast;
import com.aristata.ch03decorator.ex1.coffee.Espresso;
import com.aristata.ch03decorator.ex1.coffee.HouseBlend;
import com.aristata.ch03decorator.ex1.condiment.Mocha;
import com.aristata.ch03decorator.ex1.condiment.Soy;
import com.aristata.ch03decorator.ex1.condiment.SteamMilk;
import com.aristata.ch03decorator.ex1.condiment.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso(); // (1)
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new DarkRoast(); // (2)
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend(); // (3)
        beverage2 = new Soy(beverage2);
        beverage2 = new SteamMilk(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
    /*
     * (1) 아무것도 넣지 않은 에스프레소를 주문하고 그 음료에 대한 설명과 가격을 출력한다.
     * (2) 다크로스트 커피에 모카를 두번, 휘핑 크림 올려서
     * (3) 하우스블랜드 커피에 두유 스팀한 다음 모카 추가하고 휘핑 크림 올려서*/
}
