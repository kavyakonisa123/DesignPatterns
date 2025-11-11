package com.proxy.gumballmachine;

public class GumballMachineDispenser {
	public static void main(String[] args) {
		int count=0;
		if(args.length <2) {
			System.out.println("GumballMachine <inventory> <name> ");	
			System.exit(1);
		}
		
		count=Integer.parseInt(args[0]);
		
		GumballStateMachine gumballMachine= new GumballStateMachine(count, args[1]);
		GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);
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
		
		gumballMonitor.report();
		
	}

}
