package com.proxy.gumballmachine;

import java.rmi.Naming;

public class GumballMachineDispenser {
	public static void main(String[] args) {
		int count=0;
		if(args.length <2) {
			System.out.println("GumballMachine <inventory> <name> ");	
			System.exit(1);
		}
		try {
		
		count=Integer.parseInt(args[0]);
		
		GumballStateMachine gumballMachine= new GumballStateMachine(count, args[1]);
		Naming.bind("rmi://127.0.0.1/" + args[1] + "/gumballmachine", gumballMachine);


		System.out.println("............"+gumballMachine.toString());
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println("............"+gumballMachine.toString());
		gumballMachine.insertQuarter();
		gumballMachine.ejectQuarter();
		gumballMachine.turnCrank();
		
		System.out.println("............"+gumballMachine.toString());
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.ejectQuarter();
		
		System.out.println("............"+gumballMachine.toString());
		gumballMachine.insertQuarter();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.ejectQuarter();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		
		
		
		
		System.out.println("............"+gumballMachine.toString());
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		System.out.println("............"+gumballMachine.toString());


		gumballMachine.refill(5);
		
		System.out.println("............"+gumballMachine.toString());
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.ejectQuarter();
		
		System.out.println("............"+gumballMachine.toString());
		gumballMachine.insertQuarter();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.ejectQuarter();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		

//		
	}

}



