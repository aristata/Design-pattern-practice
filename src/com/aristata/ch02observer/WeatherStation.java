package com.aristata.ch02observer;

public class WeatherStation {
    public static void main(String[] args) {
        // WeatherData Instance 생성
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(30, 65, 30.4f);
        weatherData.setMeasurements(32, 75, 35.4f);
        weatherData.setMeasurements(29, 57, 29.4f);
    }
}
