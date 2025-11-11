package com.proxy.gumballmachine;

public class GumballMonitor {
	
	GumballStateMachine gumballStateMachine;
	public GumballMonitor(GumballStateMachine gumballStateMachine) {
		this.gumballStateMachine= gumballStateMachine;
	}

	public void report() {
		System.out.println("Current Location: " + gumballStateMachine.getLocation());

		System.out.println("Current Inventory: " + gumballStateMachine.getCount() + " Inventory");
		System.out.println("Current State: " + gumballStateMachine.getState());

	}

}
