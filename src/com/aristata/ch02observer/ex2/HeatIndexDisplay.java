package com.aristata.ch02observer.ex2;

import com.aristata.ch02observer.ex1.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class HeatIndexDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float heatIndex;
    Observable observable;

    public HeatIndexDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    private float computeHeatIndex(float temperature, float humidity) {
        float index = (float) ((16.923 + (0.185212 * temperature) + (5.37941 * humidity) - (0.100254 * temperature * humidity) +
                (0.00941695 * (temperature * temperature)) + (0.00728898 * (humidity * humidity)) +
                (0.000345372 * (temperature * temperature * humidity)) - (0.000814971 * (temperature * humidity * humidity)) +
                (0.0000102102 * (temperature * temperature * humidity * humidity)) - (0.000038646 * (temperature * temperature * temperature)) + (0.0000291583 *
                (humidity * humidity * humidity)) + (0.00000142721 * (temperature * temperature * temperature * humidity)) +
                (0.000000197483 * (temperature * humidity * humidity * humidity)) - (0.0000000218429 * (temperature * temperature * temperature * humidity * humidity)) +
                0.000000000843296 * (temperature * temperature * humidity * humidity * humidity)) -
                (0.0000000000481975 * (temperature * temperature * temperature * humidity * humidity * humidity)));
        return index;
    }

    @Override
    public void display() {
        StringBuilder message = new StringBuilder();
        message.append("Heat index is ");
        message.append(this.heatIndex);
        System.out.println(message);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.heatIndex = computeHeatIndex(this.temperature, this.humidity);
            display();
        }
    }
}
