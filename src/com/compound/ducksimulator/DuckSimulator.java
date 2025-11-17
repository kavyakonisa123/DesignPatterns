package com.compound.ducksimulator;

public class DuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuckSimulator simulator = new DuckSimulator();
		simulator.simulate();

	}

	 void simulate() {
		Quackable mallardDuck = new QuackCounter(new MallardDuck());
		Quackable redheadDuck = new QuackCounter(new RedheadDuck());
		Quackable duckCall = new QuackCounter(new DuckCall());
		Quackable rubberDuck = new QuackCounter(new RubberDuck());
		Quackable gooseAdapter = new GooseAdapter(new Goose());

		
		System.out.println("\nDuck simulator");
		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseAdapter);

		System.out.println("The ducks Quacked "+ QuackCounter.getQuacks()+ " times");

	}

	private void simulate(Quackable duck) {
		duck.quack();
		
	}

}
