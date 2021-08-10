package com.aristata.ch02observer.ex1;

public interface Observer {
    /* 기상 정보가 변경되었을 때 옵저버한테 전달되는 상태값들을 업데이트한다 */
    void update(
            float temp,
            float humidity,
            float pressure
    );
}
