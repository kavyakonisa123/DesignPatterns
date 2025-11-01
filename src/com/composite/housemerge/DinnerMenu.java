package com.composite.housemerge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.composite.housemerge.MenuComponent;
import com.composite.housemerge.MenuItem;

public class DinnerMenu extends MenuComponent{
	public final int MAX_ITEMS = 5;
	int noOfItems=0;
	MenuItem[] menuItems;

	List<MenuComponent>  menuComponents= new ArrayList<>();
	String name;
	String description;
	
	public void addChild(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}

	public void removeChild(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
		
	}
	public MenuComponent getChild(int index) {
		return menuComponents.get(index);
	}

	public DinnerMenu(String name, String description) {
		this.name = name;
		this.description = description;
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


	public void setMenuItems(MenuItem[] menuItems) {
		this.menuItems = menuItems;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public void print()
	{
	
	System.out.print("\n " + getName());
	System.out.print(" " + getDescription());
	System.out.println("\n-------------- ");
	for (MenuComponent item : menuItems) { 
		item.print(); 
		}
	for(MenuComponent menuComponent : menuComponents) {
		menuComponent.print();
	}
	}
	
	
	
	

}
