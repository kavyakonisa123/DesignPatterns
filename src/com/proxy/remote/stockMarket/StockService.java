package com.proxy.remote.stockMarket;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface StockService extends Remote{
    double getStockPrice(String tickerSymbol) throws RemoteException;

}
