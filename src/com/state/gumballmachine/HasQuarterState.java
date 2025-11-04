package com.state.gumballmachine;

public class HasQuarterState implements State {

	GumballStateMachine gumballStateMachine;

	public HasQuarterState(GumballStateMachine gumballStateMachine) {
		this.gumballStateMachine = gumballStateMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You already inserted a quarter");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("You ejected the quarter");
		gumballStateMachine.setState(gumballStateMachine.getNoQuarterState());

	}

	@Override
	public void turnCrack() {
		System.out.println("You turned the crack");
		gumballStateMachine.setState(gumballStateMachine.getSoldState());
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");
		


	}

}
