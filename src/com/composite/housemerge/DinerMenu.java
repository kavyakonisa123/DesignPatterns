package com.composite.housemerge;


public class DinerMenu{
	public final int MAX_ITEMS = 5;
	int noOfItems=0;
	MenuItem[] menuItems;

	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];

		addItem("Vegetarian BLT", "Fakin’ Bacon with lettuce and tomato on whole wheat bread.", true, 5.99);

		addItem("Soup of the Day", "A bowl of the soup of the day, with a side of salad.", true, 4.29);

		addItem("Hotdog", "A grilled hotdog, served on a bun with sauerkraut, relish, onions, topped with cheese.",
				false, 3.99);

		addItem("Steamed Veggies and Brown Rice", "A medley of fresh steamed vegetables served over brown rice.", true,
				5.49);

		addItem("Pasta with Marinara Sauce", "Spaghetti with marinara sauce, and a slice of garlic bread.", true, 6.89);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian,  price);
		if(noOfItems >= MAX_ITEMS) System.out.println("Sorry..Menu is Full");
		else {
			menuItems[noOfItems]= menuItem;
			noOfItems= noOfItems+1;
		}
		
		
	}

	public MenuItem[] getMenuItems() {
		return menuItems;
	}

	public void setMenuItems(MenuItem[] menuItems) {
		this.menuItems = menuItems;
	}
	
	

}
