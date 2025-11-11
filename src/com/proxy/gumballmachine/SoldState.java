package com.proxy.gumballmachine;

public class SoldState implements State {
	GumballStateMachine gumballStateMachine;

	public SoldState(GumballStateMachine gumballStateMachine) {
		this.gumballStateMachine= gumballStateMachine;
	}
	

	@Override
	public void insertQuarter() {
		System.out.println("We're in process to give you a gumball....You already inserted a quarter");


	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry you already turned the crank");


	}

	@Override
	public void turnCrack() {
		System.out.println("Sorry you already turned the crank.. No use turning this twice");

	}

	@Override
	public void dispense() {
		gumballStateMachine.releaseBall();
		if(gumballStateMachine.getCount()>0) {
			gumballStateMachine.setState(gumballStateMachine.getNoQuarterState());
		}
		else {
			System.out.println("Sorry we are out of gumballs");
			gumballStateMachine.setState(gumballStateMachine.getSoldOutState());
		}

	}
	
	public void refill() {
		System.out.println("Its not time for refill .. You can still play");
	}

}
