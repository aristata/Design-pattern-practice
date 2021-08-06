package com.aristata.ch01strategy;

import com.aristata.ch01strategy.duck.Duck;
import com.aristata.ch01strategy.duck.MallardDuck;
import com.aristata.ch01strategy.duck.ModelDuck;
import com.aristata.ch01strategy.fly.FlyRocketPowered;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly(); // 생성자에서 설정되었던 FlyNoWay 인스턴스의 fly 가 호출됨
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
