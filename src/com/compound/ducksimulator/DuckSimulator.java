package com.compound.ducksimulator;

public class DuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory  duckFactory = new CountingDuckFactory();
		AbstractGooseFactory gooseFactory = new GooseFactory();
		simulator.simulate(duckFactory,gooseFactory);

	}

	 void simulate(AbstractDuckFactory  duckFactory,AbstractGooseFactory gooseFactory) {
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseAdapter = gooseFactory.createGoose();

		
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
