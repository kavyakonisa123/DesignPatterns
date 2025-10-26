package com.template.barista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffineBeverage{

	@Override
	void brew() {
		System.out.println("Dripping Coffee with filter");
		
	}

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Adding Milk and sugar");

		
	}
	public boolean customerWantscondiments() {
		String answer = getUserInput();
		if(answer.toLowerCase().startsWith("y")) return true;
		else return false;
	}
	
	private String getUserInput() {
		String answer= null;
		System.out.println("Would you like milk and sugar with your coffee (Y/N)");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer= in.readLine();
		}
		catch(IOException e){
			System.err.println("IO error whrn reading answer");
			
		}
		if(answer== null) {
			return "no";
		}
		return answer;
		

	}

}
