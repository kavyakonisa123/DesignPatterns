package com.observer.stockmarket;

public class TradingBot implements Observer {
    private final StockMarket market;
    private final double buyThreshold;
    public TradingBot(StockMarket market, double buyThreshold) {
        this.market = market;
        this.buyThreshold = buyThreshold;
        market.registerObserver(this);

    }
    
    @Override
    public void update(String symbol) {
        double price = market.getPrice(symbol).orElse(Double.NaN);
        if (!Double.isNaN(price) && price <= buyThreshold) {
            System.out.printf("[TradingBot] Buying %s at $%.2f (threshold: $%.2f)%n",
                    symbol, price, buyThreshold);
        }
    }
}