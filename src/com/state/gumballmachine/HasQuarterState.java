package com.state.gumballmachine;

import java.util.Random;

public class HasQuarterState implements State {

	GumballStateMachine gumballStateMachine;
	Random randomWinner = new Random(System.currentTimeMillis());

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
		int winner= randomWinner.nextInt(10);
		if((winner==0 ) && gumballStateMachine.count >1){
			gumballStateMachine.setState(gumballStateMachine.getWinnerState());

		}else {
		gumballStateMachine.setState(gumballStateMachine.getSoldState());}
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");
		


	}
	public void refill() {
		System.out.println("Its not time for refill .. You can still play");
	}

}
