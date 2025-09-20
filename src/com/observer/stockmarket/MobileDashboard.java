package com.observer.stockmarket;

public class MobileDashboard implements Observer {
    private final StockMarket market; // composition for pull
    public MobileDashboard(StockMarket market) {
        this.market = market;
        market.registerObserver(this);
    }
    @Override
    public void update(String symbol) {
        double price = market.getPrice(symbol).orElse(Double.NaN);
        System.out.printf("[MobileDashboard] %s updated → $%.2f%n", symbol, price);
    }
}