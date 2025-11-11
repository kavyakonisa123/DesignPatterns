package com.proxy.gumballmachine;

import java.rmi.Naming;

public class GumballMonitorTestDrive {
	
	public static void main(String[] args){
		String[] location= {
				"rmi://127.0.0.1/tampa/gumballmachine",
				"rmi://127.0.0.1/boulder/gumballmachine",
				"rmi://127.0.0.1/austin/gumballmachine",
		};
		
		GumballMonitor[] monitor = new GumballMonitor[location.length];
		
		for(int i=0;i< location.length; i++) {
			try {
				System.out.println(location[i]); 
				GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
				System.out.println(machine); 
				monitor[i] = new GumballMonitor(machine);
				System.out.println(monitor[i]); 
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		for(int i=0;i< monitor.length; i++) {
			monitor[i].report();
		}
		
	}

}
