package com.composite.housemerge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import com.composite.housemerge.MenuComponent;
import com.composite.housemerge.MenuItem;

public class CafeMenu extends MenuComponent {
	Map<String, MenuItem> menuItems = new HashMap<String, MenuItem>();
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

	public CafeMenu(String name, String description) {
		this.name = name;
		this.description = description;

		addItem("Veggie Burger", "A juicy plant-based burger with lettuce, tomato, and vegan mayo.", true, 8.99);
		addItem("French Fries", "Crispy golden fries served with ketchup.", true, 3.49);
		addItem("Tomato Soup", "Rich and creamy tomato soup with a hint of basil.", true, 4.99);
		addItem("Chicken Burrito", "Grilled chicken with beans, rice, and cheese wrapped in a warm tortilla.", false,
				9.49);
		addItem("Cheese Quesadilla", "Melted cheese in a toasted tortilla served with salsa.", true, 6.99);
		addItem("Chicken Nachos", "Loaded nachos topped with spiced chicken, jalapeños, and cheddar cheese.", false,
				10.49);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.put(name, menuItem);

	}

	public Map<String, MenuItem> getMenuItems() {
		return menuItems;
	}

	public void setMenuItems(Map<String, MenuItem> menuItems) {
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
	public void print() {
		
		System.out.print("\n " + getName());
		System.out.print(" " + getDescription());
		System.out.println("\n-------------- ");
		
		for (MenuItem item : menuItems.values()) {
			item.print();
		}
		for(MenuComponent menuComponent : menuComponents) {
			menuComponent.print();
		}
	}

}
