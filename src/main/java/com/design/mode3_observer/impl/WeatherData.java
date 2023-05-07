package com.design.mode3_observer.impl;

import com.design.mode3_observer.Observer;
import com.design.mode3_observer.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sgp
 * @date 2023-05-07
 */
public class WeatherData implements Subject {

    private List<Observer> observerList;

    private float temperature;

    private float humidity;

    private float pressure;

    public WeatherData(){
        observerList = new ArrayList<Observer>();
    }



    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void notice() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }

    public void measurementsChanges(){
        notice();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanges();
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
