package com.state.gumballmachine;

public interface State {
	public void insertQuarter();
	public void ejectQuarter();
	public void turnCrack();
	public void dispense();

}
