package com.aristata.ch02observer.ex1;

public interface Subject {
    /* 옵저버 등록 */
    void registerObserver(Observer o);

    /* 옵저버 제거 */
    void removeObserver(Observer o);

    /* 주제 객체의 상태가 변경되었을때 모든 옵저버들에게 알리기 위해 호출되는 메소드 */
    void notifyObservers();
}
