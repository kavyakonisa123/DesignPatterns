package com.observer.stockmarket;

public class StockExchangeStation {
	    public static void main(String[] args) {
	        StockMarket market = new StockMarket();
	        Observer ui = new MobileDashboard(market);
	        Observer bot = new TradingBot(market, 150.00);
	        market.setPrice("AAPL", 172.45);  // both observers react
	        market.setPrice("GOOG", 149.80);  // bot may buy; UI updates
	        market.removeObserver(ui);
	        market.setPrice("AAPL", 160.10);  // only bot reacts now
	    }
	}