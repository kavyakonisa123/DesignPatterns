package com.proxy.remote.stockMarket;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class StockClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            StockService service = (StockService) registry.lookup("StockService");

            double price = service.getStockPrice("AAPL");
            System.out.println("AAPL Stock Price = " + price);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
