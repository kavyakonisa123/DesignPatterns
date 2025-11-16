package com.proxy.remote.stockMarket;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class StockServer {
    public static void main(String[] args) {
        try {
            StockService service = new StockServiceImpl();

            Registry registry = LocateRegistry.getRegistry(1099);
            registry.rebind("StockService", service);

            System.out.println("Stock RMI Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
