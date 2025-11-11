package com.state.vendingmachine;

public interface State {
    void insertCoin();
    void pressButton();
    void dispense();
}
