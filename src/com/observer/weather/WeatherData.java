package com.observer.weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers= new ArrayList<>();
		
	}

	
	public void registerObserver(Observer o) {
		observers.add(o);
		
	}


	public void removeObserver(Observer o) {
		observers.remove(o);
		
	}

	
	public void notifyObservers(){
		for(Observer observer : observers) {
			observer.update();
		}
		
	}
	
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature=temperature;
		this.humidity=humidity;
		this.pressure= pressure;
		measurementsChanged();
	}


	private void measurementsChanged() {
		notifyObservers();
		
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


	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}


	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}


	public void setPressure(float pressure) {
		this.pressure = pressure;
	}


}
