package com.observer.stockmarket;

public interface Observer {
	void update(String symbol); // minimal push; observers can pull details if needed

}
