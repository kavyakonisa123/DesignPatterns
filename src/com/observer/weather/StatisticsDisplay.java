package com.observer.weather;

public class StatisticsDisplay implements Observer, DisplayElement{
	private float temperature;
	private WeatherData weatherData;

	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData= weatherData;
		weatherData.registerObserver(this);

	}

	@Override
	public void update() {
		this.temperature=weatherData.getTemperature();
		display();

	}

	@Override
	public void display() {
		System.out.println("Avg/Max/Min temperature: " + (temperature+2)+ "/ " + (temperature+4)+ "/ "+ temperature);

	}
}

