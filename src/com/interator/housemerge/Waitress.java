package com.interator.housemerge;

//import java.util.List;

public class Waitress {
//	public static void main(String args[]) {
		
//		PancakeHouseMenu pancakeHouseMenu= new PancakeHouseMenu();
//		List<MenuItem> breakfastMenu= pancakeHouseMenu.getMenuItems();
//		
//		System.out.println("\n Breakfast.......................");
//
//		
//		for(int i=0; i< breakfastMenu.size();i++) {
//			MenuItem menuItem = breakfastMenu.get(i);
//			System.out.print(menuItem.getName()+ "---- ");
//			System.out.print(menuItem.getDescription()+ "---- ");
//			System.out.print(menuItem.getPrice()+ " "+"\n");
//	
//		}
//		System.out.println("\n Lunch.......................");
//
//		DinerMenu dinerMenu= new DinerMenu();	
//		MenuItem[] lunchItems= dinerMenu.getMenuItems();
//		for(int i=0; i< lunchItems.length;i++) {
//			MenuItem menuItem = lunchItems[i];
//			System.out.print(menuItem.getName()+ "---- ");
//			System.out.print(menuItem.getDescription()+ "---- ");
//			System.out.print(menuItem.getPrice()+ " "+"\n");
//	
//		}
		// After adding Iterator
		
		PancakeHouseMenu pancakeHouseMenu;
		DinerMenu dinerMenu;
		 

		public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
			this.pancakeHouseMenu = pancakeHouseMenu;
			this.dinerMenu = dinerMenu;
		}
		
		public void printMenu() {
			Iterator pancakeIterator = pancakeHouseMenu.createIterator();
			Iterator dinerIterator = dinerMenu.createIterator();
			System.out.println("\n Breakfast.......................");
			printMenu(pancakeIterator);
			System.out.println("\n Lunch.......................");
			printMenu(dinerIterator);


		}
		
		private void printMenu(Iterator iterator) {
			while(iterator.hasNext()) {
				MenuItem menuItem = iterator.next();
				System.out.print(menuItem.getName()+ "---- ");
				System.out.print(menuItem.getDescription()+ "---- ");
				System.out.print(menuItem.getPrice()+ " "+"\n");
				
			}
		}


}
