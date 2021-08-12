package com.aristata.ch03decorator.ex1.coffee;


public abstract class Beverage { // (1)
    String description = "제목 없음";

    public String getDescription() {
        if (size == null) {
            setSize(BeverageSize.TALL);
        }
        return description;
    } // (2)

    private BeverageSize size;

    public BeverageSize getSize() {
        return size;
    }

    public void setSize(BeverageSize size) {
        this.size = size;
        description = description + "(" + size.toString() + ")";
    }

    public abstract double cost(); // (2)



    /*
     *  (1) Beverage 는 추상 클래스이며, getDescription 메소드와 cost 메소드를 가지고 있다
     *  (2) getDescription 은 구현이 되어 있지만, cost 는 서브 클래스에서 구현을 해야 한다
     */
}
