package com.observer.stockmarket;

public interface Subject {
	// Subject interface (Observable)
	    void registerObserver(Observer o);
	    void removeObserver(Observer o);
	    void notifyObservers(String symbol); // we'll push which symbol changed
}
