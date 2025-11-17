package com.compound.ducksimulator;

public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
	

}
