package com.proxy.gumballmachine;

import java.rmi.RemoteException;

public class GumballMonitor {
	
	GumballMachineRemote gumballMachineRemote;
	public GumballMonitor(GumballMachineRemote gumballMachineRemote) {
		this.gumballMachineRemote= gumballMachineRemote;
	}

	public void report() {
		
		try {
			System.out.println("Current Location: " + gumballMachineRemote.getLocation());
			System.out.println("Current Inventory: " + gumballMachineRemote.getCount() + " Inventory");
			System.out.println("Current State: " + gumballMachineRemote.getState());

		} catch (RemoteException e) {
			e.printStackTrace();
		}

		
	}

}
