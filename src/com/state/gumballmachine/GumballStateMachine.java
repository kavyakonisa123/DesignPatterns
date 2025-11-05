package com.state.gumballmachine;

public class GumballStateMachine {
	
	//Lets define states
		State soldOutState;
		State noQuarterState;
		State hasQuarterState ;
		State soldState;
		State winnerState;

		//Current state
		State state;
		int count=0;
		
		public GumballStateMachine(int gumballCount) {
			soldOutState= new SoldOutState(this);
			noQuarterState= new NoQuarterState(this);
			hasQuarterState = new HasQuarterState(this);
			soldState= new SoldState(this);
			winnerState= new winnerState(this);
			this.count=gumballCount;
			
			if(gumballCount>0) state= noQuarterState;
			else state= soldOutState;
		}
		
		public State getSoldOutState() {
			return soldOutState;
		}

		public void setSoldOutState(State soldOutState) {
			this.soldOutState = soldOutState;
		}

		public State getNoQuarterState() {
			return noQuarterState;
		}

		public void setNoQuarterState(State noQuarterState) {
			this.noQuarterState = noQuarterState;
		}

		public State getHasQuarterState() {
			return hasQuarterState;
		}

		public void setHasQuarterState(State hasQuarterState) {
			this.hasQuarterState = hasQuarterState;
		}

		public State getSoldState() {
			return soldState;
		}

		public void setSoldState(State soldState) {
			this.soldState = soldState;
		}

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}

		
		public State getState() {
			return state;
		}

		public void setState(State state) {
			this.state = state;
		}
		

		public State getWinnerState() {
			return winnerState;
		}

		public void setWinnerState(State winnerState) {
			this.winnerState = winnerState;
		}

		//actions
		public void insertQuarter() {
			state.insertQuarter();
		}
		
		public void ejectQuarter() {
			state.ejectQuarter();
		}
		
		public void turnCrank() {
			state.turnCrack();
			state.dispense();
		}
		
		public void releaseBall() {
			System.out.println("We are rolling your  gumball");

			if(count>0) count -=1;
		}
		public void refill(int count) {
			this.count += count;
			System.out.println("We are refilling your gumball machine... the new count is " + this.getCount());
			state.refill();
			
		}

		@Override
		public String toString() {
			return "GumballStateMachine [state=" + state + ", count=" + count + "]";
		}

}
