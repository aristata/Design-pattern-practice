package com.aristata.ch02observer.ex1;

public class WeatherStation {
    public static void main(String[] args) {
        // WeatherData Instance 생성
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80.0f, 65, 30.4f);
        weatherData.setMeasurements(82.0f, 75, 35.4f);
        weatherData.setMeasurements(79.4f, 57, 29.4f);
    }
}
