package com.state.vendingmachine;

public class DispensingState implements State {
    private VendingMachine machine;
    public DispensingState(VendingMachine machine) {
        this.machine = machine;
    }
    public void insertCoin() {
        System.out.println("Please wait... dispensing in progress.");
    }
    public void pressButton() {
        System.out.println("Already dispensing...");
    }
    public void dispense() {
        System.out.println("Item dispensed!");
        machine.setState(machine.getNoCoinState());
    }
}
