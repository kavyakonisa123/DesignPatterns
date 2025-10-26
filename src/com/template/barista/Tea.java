package com.template.barista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends CaffineBeverage{

	@Override
	void brew() {
		System.out.println("Steeping the tea");
		
	}

	@Override
	void addCondiments() {
		System.out.println("Adding Lemon");

		
	}
	
	public boolean customerWantscondiments() {
		String answer = getUserInput();
		if(answer.toLowerCase().startsWith("y")) return true;
		else return false;
	}
	
	private String getUserInput() {
		String answer= null;
		System.out.println("Would you likeLemon with your tea (Y/N)");
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
