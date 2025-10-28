package com.interator.housemerge;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
	List<MenuItem> menuItems;

	public PancakeHouseMenu() {
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

//	public List<MenuItem> getMenuItems() {
//		return menuItems;
//	}
	public Iterator<MenuItem> createIterator() {
//		return new PancakeHouseMenuIterator(menuItems);
		return menuItems.iterator();

	}


	public void setMenuItems(List<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}
	
	
	
	

}
