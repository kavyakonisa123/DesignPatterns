package com.proxy.gumballmachine;

import java.io.Serializable;

public interface State extends Serializable{
	public void insertQuarter();
	public void ejectQuarter();
	public void turnCrack();
	public void dispense();
	public void refill();


}
