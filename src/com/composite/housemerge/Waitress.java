package com.composite.housemerge;


public class Waitress {

		MenuComponent menus;
		 
		
		public Waitress(MenuComponent menus) {
			this.menus= menus;
		}
		
		public void printMenu() {
			menus.print();

		}
		
		


}
