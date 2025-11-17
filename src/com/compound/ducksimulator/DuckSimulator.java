package com.compound.ducksimulator;

public class DuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuckSimulator simulator = new DuckSimulator();
		simulator.simulate();

	}

	 void simulate() {
		Quackable mallardDuck = new MallardDuck();
		Quackable redheadDuck = new RedheadDuck();
		Quackable duckCall = new DuckCall();
		Quackable rubberDuck = new RubberDuck();
		Quackable gooseAdapter = new GooseAdapter(new Goose());

		
		System.out.println("\nDuck simulator");
		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseAdapter);

		
	}

	private void simulate(Quackable duck) {
		duck.quack();
		
	}

}
