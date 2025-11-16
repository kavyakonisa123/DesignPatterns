package com.proxy.remote.stockMarket;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class StockServiceImpl extends UnicastRemoteObject implements StockService {

    protected StockServiceImpl() throws RemoteException {
        super(); // exports the object → makes it available remotely
    }

    @Override
    public double getStockPrice(String tickerSymbol) throws RemoteException {
        // Simulating business logic
        switch(tickerSymbol) {
            case "AAPL": return 189.55;
            case "GOOGL": return 142.33;
            case "TSLA": return 234.80;
            default: return 0.0;
        }
    }
}
