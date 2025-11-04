package com.state.gumballmachine;

public class GumballMachineDispenser {
	public static void main(String[] args) {
//		GumballMachine gumballMachine= new GumballMachine(5);
		GumballStateMachine gumballMachine= new GumballStateMachine(5);
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


		

		
	}

}
