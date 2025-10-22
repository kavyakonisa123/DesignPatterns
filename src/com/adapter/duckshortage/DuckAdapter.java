package com.adapter.duckshortage;

import java.util.*;

public class DuckAdapter implements Turkey {

	Duck duck;
	
	public DuckAdapter(Duck duck) {
		this.duck = duck;
	}

	public void gobble() {
		duck.quack();
	}

	public void fly() {
        Random rand = new Random();
		if(rand.nextInt(5) ==0) {
			duck.fly();
		}
		
	}
}
