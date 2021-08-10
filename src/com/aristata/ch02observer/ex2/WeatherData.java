package com.aristata.ch02observer.ex2;

import java.util.Observable;

public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    // 이제 생성자에서 옵저버 목록을 저장하기 위한 자료구조를 생성하지 않아도 된다.
    public WeatherData() {
    }

    public void measurementsChanged() {
        setChanged();
        // notifyObservers 메소드를 호출하기 전에 객체의 상태가 바뀌었다는 것을 알려야 한다

        notifyObservers();
        // 파라미터로 아무것도 넘기지 않고 있다.
        // 이것은 pull 방식으로 데이터를 전달한다는 뜻이다.
        // 따라서 getter 메소드들이 필요하다.
    }

    public void setMeasurements(
            float temperature,
            float humidity,
            float pressure
    ) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
