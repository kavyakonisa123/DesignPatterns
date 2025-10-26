package com.template.sortducks;

import java.util.Arrays;

public class DuctSortDrive {

	public static void main(String[] args) {
		Duck[] ducks= {
				new Duck("Excited",9),
				new Duck("Wild",8),
				new Duck("Happy",10),
				new Duck("Sad",5),
				new Duck("Angry",2),
				new Duck("Surprised",8)
		};
		System.out.println("Before sorting: ");
		display(ducks);
		Arrays.sort(ducks);;
		
		System.out.println("After sorting: ");
		display(ducks);
	}

	private static void display(Duck[] ducks) {
		for(Duck d :ducks) {
			System.out.print(d);
		}
	}
	
	

}
