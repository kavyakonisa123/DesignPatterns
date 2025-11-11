package com.state.vendingmachine;

public class NoCoinState implements State {
    private VendingMachine machine;

    public NoCoinState(VendingMachine machine) {
        this.machine = machine;
    }
    public void insertCoin() {
        System.out.println("Coin inserted.");
        machine.setState(machine.getHasCoinState());
    }
    public void pressButton() {
        System.out.println("You need to insert a coin first.");
    }
    public void dispense() {
        System.out.println("Insert coin before dispensing.");
    }
}