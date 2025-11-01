package com.composite.housemerge;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.composite.housemerge.MenuComponent;
import com.composite.housemerge.MenuItem;

public class PancakeHouseMenu extends MenuComponent {
	List<MenuItem> menuItems;

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

	public PancakeHouseMenu(String name, String description) {
		this.name = name;
		this.description = description;
		menuItems = new ArrayList<MenuItem>();
		
		addItem(
			    "Regular Pancake Breakfast",
			    "Pancakes with scrambled eggs and sausage.",
			    false,
			    5.99
			);

		addItem(
			    "Blueberry Pancakes",
			    "Pancakes made with fresh blueberries and served with blueberry syrup.",
			    true,
			    6.49
			);

		addItem(
			    "Waffles with Strawberries",
			    "Waffles covered with strawberries and whipped cream.",
			    true,
			    5.59
			);

		addItem(
			    "French Toast Combo",
			    "French toast with two eggs and bacon.",
			    false,
			    6.99
			);

		addItem(
			    "Vegetarian Omelette",
			    "Three-egg omelette with spinach, mushrooms, and cheese.",
			    true,
			    7.49
			);

		addItem(
			    "Breakfast Burrito",
			    "Flour tortilla filled with eggs, sausage, and cheese.",
			    false,
			    6.29
			);

		addItem(
			    "Fruit & Yogurt Parfait",
			    "Layers of fresh fruit, granola, and yogurt.",
			    true,
			    4.99
			);

		addItem(
			    "Deluxe Pancake Platter",
			    "Three buttermilk pancakes with eggs, bacon, and hash browns.",
			    false,
			    7.99
			);

		addItem(
			    "Oatmeal with Brown Sugar",
			    "Hot oatmeal topped with raisins, milk, and brown sugar.",
			    true,
			    4.29
		);

		addItem(
			    "Banana Nut Pancakes",
			    "Fluffy pancakes with banana slices and walnuts, served with syrup.",
			    true,
			    6.79
			);
		
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem= new MenuItem(name, description, vegetarian,  price);
		menuItems.add(menuItem);
		
	}



	public List<MenuItem> getMenuItems() {
		return menuItems;
	}

	public void setMenuItems(List<MenuItem> menuItems) {
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
		for (MenuComponent item : menuItems) {
            item.print();
        }
		for(MenuComponent menuComponent : menuComponents) {
			menuComponent.print();
		}
    }
	
	
	
	

}
