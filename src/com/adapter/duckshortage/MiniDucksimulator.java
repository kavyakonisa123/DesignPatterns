package com.adapter.duckshortage;

public class MiniDucksimulator {

	public static void main(String[] args) {
		Duck mallard= new MallardDuck();

		Turkey turkey= new WildTurkey();
		Duck turkeyAdapter= new TurkeyAdapter(turkey);
		Turkey duckAdapter= new DuckAdapter(mallard);

		
		System.out.println("The Duck says--------------------");
		mallard.quack();
		mallard.fly();

		
		System.out.println("The turkey says-----------------");
		turkey.gobble();
		turkey.fly();

		
		System.out.println("The turkeyAdapter says---------------");
		turkeyAdapter.quack();
		turkeyAdapter.fly();
		
		System.out.println("The duckAdapter says--------------------");
		duckAdapter.gobble();
		duckAdapter.fly();
		

	}

}
