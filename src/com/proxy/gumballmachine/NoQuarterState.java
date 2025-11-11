package com.proxy.gumballmachine;

public class NoQuarterState implements State{
	GumballStateMachine gumballStateMachine;
	public NoQuarterState(GumballStateMachine gumballStateMachine) {
		this.gumballStateMachine= gumballStateMachine;
	}

	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		gumballStateMachine.setState(gumballStateMachine.getHasQuarterState());
		
	}

	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
		
	}


	public void turnCrack() {
		System.out.println("You turned on but haven't inserted a quarter");
		
	}

	public void dispense() {
		System.out.println("You haven't inserted a quarter.. Pay to start");
		
	}
	public void refill() {
		System.out.println("Its not time for refill .. You can still play");
	}


}
