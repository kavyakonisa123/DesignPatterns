package com.state.vendingmachine;

public class HasCoinState implements State {
    private VendingMachine machine;
    public HasCoinState(VendingMachine machine) {
        this.machine = machine;
    }
    public void insertCoin() {
        System.out.println("Coin already inserted.");
    }
    public void pressButton() {
        System.out.println("Button pressed...");
        machine.setState(machine.getDispensingState());
    }
    public void dispense() {
        System.out.println("Dispensing item...");
        machine.setState(machine.getNoCoinState());
    }
}