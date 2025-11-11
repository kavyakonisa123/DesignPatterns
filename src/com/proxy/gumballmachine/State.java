package com.proxy.gumballmachine;

public interface State {
	public void insertQuarter();
	public void ejectQuarter();
	public void turnCrack();
	public void dispense();
	public void refill();


}
