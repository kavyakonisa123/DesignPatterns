package com.example.observer;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData= new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statsticsDisplay= new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay= new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
		weatherData.setMeasurements(80, 60, 30.70f);
		weatherData.setMeasurements(70, 55, 39.45f);
		weatherData.setMeasurements(70, 55, 37.6f);

	}

}
