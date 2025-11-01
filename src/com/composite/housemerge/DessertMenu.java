package com.composite.housemerge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.composite.housemerge.MenuComponent;
import com.composite.housemerge.MenuItem;

public class DessertMenu extends MenuComponent {
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

	public DessertMenu(String name, String description) {
		this.name = name;
		this.description = description;
		addItem("Brownie with Ice cream", "Chocolate Brownie serverd with vanilla ice cream along with hot fudge",
				false, 2.99);
		addItem("Caramel chocolate cake", "A sweet cake topped with caramel and cadbury chocoilates", true, 3.49);
		addItem("Tiuramisu", "An italian delicacy enriched with cofee and cheese", false, 6.89);

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
