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
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseAdapter = gooseFactory.createGoose();

				
		Flock flockOfDucks = new Flock();
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		
		Flock flockOfMallard = new Flock();

		Quackable mallardDuckOne = duckFactory.createMallardDuck();
		Quackable mallardDuckTwo = duckFactory.createMallardDuck();
		Quackable mallardDuckThree = duckFactory.createMallardDuck();
		Quackable mallardDuckFour = duckFactory.createMallardDuck();
		
		flockOfMallard.add(mallardDuckOne);
		flockOfMallard.add(mallardDuckTwo);
		flockOfMallard.add(mallardDuckThree);
		flockOfMallard.add(mallardDuckFour);
		flockOfDucks.add(flockOfMallard);
		
		Quackologist quackologist = new Quackologist();
		flockOfDucks.registerObserver(quackologist);
		

		System.out.println("\nDuck simulator : Whole Flock Simulation");
		simulate(flockOfDucks);

		System.out.println("\nDuck simulator : Mallard Duck Flock Simulation");
		simulate(flockOfMallard);
		simulate(gooseAdapter);

		System.out.println("The ducks Quacked "+ QuackCounter.getQuacks()+ " times");


	}

	private void simulate(Quackable duck) {
		duck.quack();
		
	}

}
