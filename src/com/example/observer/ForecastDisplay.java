package com.example.observer;

public class ForecastDisplay implements Observer, DisplayElement{
	private float currentPressure = 37.6f;
	private float lastPressure;
	private WeatherData weatherData;
	
	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData= weatherData;
		weatherData.registerObserver(this);
		
	}

	public void update() {
		lastPressure=currentPressure;
		currentPressure= weatherData.getPressure();
		display();
		
	}

	public void display() {
		// Simple display messages .. may not be correct
		float difference= lastPressure-currentPressure;
		if(lastPressure < currentPressure)
		{System.out.println("Improving Weather...On the way!!");}
		else if(lastPressure > currentPressure) 
		{System.out.println("Cooler Wather ....Watch out for rain");}
		else
		{System.out.println("More or the same");}

		
	}
}
