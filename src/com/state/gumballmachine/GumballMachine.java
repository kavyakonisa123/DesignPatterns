package com.state.gumballmachine;

public class GumballMachine {
	
	//Lets define states
	final static int SOLD_OUT = 0;
	final static int NO_QUARTER = 1;
	final static int HAS_QUARTER = 2;
	final static int SOLD = 3;
	
	//Current state
	int state= SOLD;
	int count=0;
	
	public GumballMachine(int count) {
		this.count=count;
		if(count>0) state= NO_QUARTER;
	}
	
	//actions
	public void insertQuarter() {
		if(state== HAS_QUARTER) {
			System.out.println("Yoi can't insert another quarter");

		}
		else if(state == NO_QUARTER) {
			state= HAS_QUARTER;
			System.out.println("You inserted a quarter");

		}
		else if(state==SOLD) {
			System.out.println("PLEASE Wait , we are giving you a gumball");

		}
		else if (state == SOLD_OUT) {
			System.out.println("You can't insert a quarter, the machine is out of gumballs");
		}
	}
	
	public void ejectQuarter() {
		if(state== HAS_QUARTER) {
			state= NO_QUARTER;
			System.out.println("Quarter returned");

		}
		else if(state == NO_QUARTER) {
			System.out.println("You haven't inserted a quarter");

		}
		else if(state==SOLD) {
			System.out.println("Sorry you already turned the crank");}
		else if (state == SOLD_OUT) {
			System.out.println("You can't eject a quarter, the havent inserted a quarter");
		}
		

		
		
	}
	
	public void turnCrank() {
		if(state==SOLD) {
			System.out.println("Sorry you already turned the crank .. you cant get another gumball");}
		
		else if(state== HAS_QUARTER) {
			state= SOLD;
			System.out.println("You turned");
			dispense();

		}
		else if(state == NO_QUARTER) {
			System.out.println("You haven't inserted a quarter");

		}
		else if (state == SOLD_OUT) {
			System.out.println("You turned the crank, but there are no gumballs");
		}
		
	}
	
	public void dispense() {
		if(state==SOLD) {
			System.out.println("We are rolling your  gumball");
			count -=1;
			if(count==0) {
				System.out.println("We are out of gumballs Now. Dont try");
				state= SOLD_OUT;
			}
			else	
			{
				state=NO_QUARTER;
			}
		}
		
		else if(state== HAS_QUARTER) {
			System.out.println("Turn the crank");

		}
		else if(state == NO_QUARTER) {
			System.out.println("You have to insert a quarter");

		}
		else if (state == SOLD_OUT) {
			System.out.println("No gumball dispensed");
		}
	}

	@Override
	public String toString() {
		return "GumballMachine [state=" + state + ", count=" + count + "]";
	}
	
	

}
