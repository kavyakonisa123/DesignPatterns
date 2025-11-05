package com.state.gumballmachine;

public class SoldOutState implements State {

	GumballStateMachine gumballStateMachine;
	public SoldOutState(GumballStateMachine gumballStateMachine) {
		this.gumballStateMachine= gumballStateMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Sorry we are out of gumballs. Dont try to insert coin");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("You can't eject a quarter, the havent inserted a quarter");

	}

	@Override
	public void turnCrack() {
		System.out.println("You turned the crank, but there are no gumballs");

	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");

	}
	public void refill() {
		gumballStateMachine.setState(gumballStateMachine.getNoQuarterState());
	}


}
