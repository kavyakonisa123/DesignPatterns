package com.interator.housemerge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class CafeMenu implements Menu {
	Map<String, MenuItem> menuItems = new HashMap<String,MenuItem>();

	public CafeMenu() {
		
		addItem("Veggie Burger", "A juicy plant-based burger with lettuce, tomato, and vegan mayo.", true, 8.99);
        addItem("French Fries", "Crispy golden fries served with ketchup.", true, 3.49);
        addItem("Tomato Soup", "Rich and creamy tomato soup with a hint of basil.", true, 4.99);
        addItem("Chicken Burrito", "Grilled chicken with beans, rice, and cheese wrapped in a warm tortilla.", false, 9.49);
        addItem("Cheese Quesadilla", "Melted cheese in a toasted tortilla served with salsa.", true, 6.99);
        addItem("Chicken Nachos", "Loaded nachos topped with spiced chicken, jalapeños, and cheddar cheese.", false, 10.49);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem= new MenuItem(name, description, vegetarian,  price);
		menuItems.put(name,menuItem);
		
	}

	public Iterator<MenuItem> createIterator() {
		return menuItems.values().iterator();

	}


	public void setMenuItems(Map<String, MenuItem> menuItems) {
		this.menuItems = menuItems;
	}




}
