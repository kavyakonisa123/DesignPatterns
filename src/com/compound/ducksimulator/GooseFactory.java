package com.compound.ducksimulator;

public class GooseFactory extends AbstractGooseFactory{

	@Override
	public Quackable createGoose() {
		// TODO Auto-generated method stub
		return new GooseAdapter(new Goose());
	}

}
