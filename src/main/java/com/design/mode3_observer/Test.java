package com.design.mode3_observer;

import com.design.mode3_observer.impl.CurrentConditionDispaly;
import com.design.mode3_observer.impl.ForecastDispaly;
import com.design.mode3_observer.impl.StatisticsDispaly;
import com.design.mode3_observer.impl.WeatherData;

/**
 * @author sgp
 * @date 2023-05-07
 */
public class Test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDispaly currentConditionDispaly = new CurrentConditionDispaly(weatherData);
        ForecastDispaly forecastDispaly = new ForecastDispaly(weatherData);
        StatisticsDispaly statisticsDispaly = new StatisticsDispaly(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,70,29.2f);
        weatherData.setMeasurements(78,90,29.2f);
    }
}
