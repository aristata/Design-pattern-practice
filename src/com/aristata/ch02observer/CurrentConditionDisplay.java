package com.aristata.ch02observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    // 생성자에 weatherData 라는 주제 객체가 전달된다
    // 그 객체를 사용하여 CurrentConditionDisplay를 옵저버로 등록한다
    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        String s1 = "Current conditions: ";
        String s2 = "F degrees and ";
        String s3 = "% humidity";
        String s4 = s1 + temperature + s2 + humidity + s3;

        System.out.println(s4);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
