package com.aristata.ch02observer;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList<Observer> observers; // observer 객체들을 저장하기 위한 arrayList
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>(); // 생성자에서 arrayList 인스턴스를 생성한다
    }

    @Override
    public void registerObserver(Observer ob) {
        observers.add(ob);
    }

    @Override
    public void removeObserver(Observer ob) {
        observers.remove(ob);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * 기상 스테이션으로부터 갱신된 측정치를 받으면 옵저버들한테 알리는 메소드
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    /**
     * 기상 스테이션으로부터 갱신된 측청지를 받는 메소드
     *
     * @param temperature
     * @param humidity
     * @param pressure
     */
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


}
