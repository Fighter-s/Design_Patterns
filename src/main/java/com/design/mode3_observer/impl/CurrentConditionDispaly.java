package com.design.mode3_observer.impl;

import com.design.mode3_observer.DispalyElement;
import com.design.mode3_observer.Observer;

/**
 * @author sgp
 * @date 2023-05-07
 */
public class CurrentConditionDispaly implements Observer, DispalyElement {
   private float temperature;
   private float humidity;
   private float pressure;
   private WeatherData weatherData;

    public CurrentConditionDispaly(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void dispaly() {
        System.out.println("CurrentConditionDispaly"+temperature+"humidity"+humidity+"pressure"+pressure);
    }

    public void update() {
        this.humidity = weatherData.getHumidity();
        this.temperature = weatherData.getTemperature();
        this.pressure = weatherData.getPressure();
        dispaly();
    }
}
