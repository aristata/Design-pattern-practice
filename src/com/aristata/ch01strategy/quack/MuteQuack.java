package com.aristata.ch01strategy.quack;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<< 조용~ >>");
    }
}
