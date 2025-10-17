package com.observer.stockmarket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
public class StockMarket implements Subject {
    private final Map<String, Double> prices = new HashMap<>();
    private final List<Observer> observers = new ArrayList<>();
    @Override
    public void registerObserver(Observer o) {
        if (o != null && !observers.contains(o)) {
			observers.add(o);
		}
    }
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    @Override
    public void notifyObservers(String symbol) {
        // iterate over a snapshot to avoid ConcurrentModification if observers change while notifying
        List<Observer> snapshot = List.copyOf(observers);
        for (Observer o : snapshot) {
            o.update(symbol);
        }
    }
    // State-changing API
    public void setPrice(String symbol, double price) {
        prices.put(symbol, price);
        notifyObservers(symbol);
    }
    // Pull API for observers
    public OptionalDouble getPrice(String symbol) {
        Double p = prices.get(symbol);
        return (p == null) ? OptionalDouble.empty() : OptionalDouble.of(p);
    }
}
