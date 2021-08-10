package com.aristata.ch02observer.ex2;

import com.aristata.ch02observer.ex1.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    Observable observable;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        StringBuilder sb = new StringBuilder();
        sb.append("Current conditions: ")
                .append(temperature)
                .append("F degrees and ")
                .append(humidity)
                .append("% humidity");
        System.out.println(sb);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
