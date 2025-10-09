package com.singleton.dbconnection;

public class DBConnectionSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ServiceA serviceA= new ServiceA();
		ServiceB serviceB= new ServiceB();
		
		serviceA.doSomething();
		serviceB.doSomething();

	}

}
