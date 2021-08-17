package com.aristata.ch03decorator.ex3wiki;

public class DecoratedWindowTest {
    public static void main(String[] args) {
        // 데코레이트 된 윈도우를 생성한다.
        // 이 윈도우는 수직, 수평 스크롤바가 달려있어야 한다.
        Window decoratedWindow = new HorizontalScrollBarDecorator(
                new VerticalScrollBarDecorator(
                        new SimpleWindow()
                )
        );

        System.out.println(decoratedWindow.getDescription());
        decoratedWindow.draw();
    }
}
