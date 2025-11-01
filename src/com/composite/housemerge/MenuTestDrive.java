package com.composite.housemerge;

import java.util.Arrays;
import java.util.List;
// Without Iterator
public class MenuTestDrive {
 
	 
	public static void main(String[] args) {

		MenuComponent pancakeHouseMenu = new Menu("PancakeHouseMenu","Breakfast");
		MenuComponent dinerMenu = new Menu("DinerMenu","Dinner");
		MenuComponent cafeMenu = new Menu("CafeMenu","Lunch");
		MenuComponent desertMenu = new Menu("DesertMenu","Desert");

		
		MenuComponent allMenus= new Menu("ALL MENUS" ," All Menus Combined");
		allMenus.addChild(pancakeHouseMenu);
		allMenus.addChild(dinerMenu);
		allMenus.addChild(cafeMenu);

		
		
		pancakeHouseMenu.addChild(new MenuItem(
			    "Regular Pancake Breakfast",
			    "Pancakes with scrambled eggs and sausage.",
			    false,
			    5.99
			));

		pancakeHouseMenu.addChild(new MenuItem(
			    "Blueberry Pancakes",
			    "Pancakes made with fresh blueberries and served with blueberry syrup.",
			    true,
			    6.49
			));

		pancakeHouseMenu.addChild(new MenuItem(
			    "Waffles with Strawberries",
			    "Waffles covered with strawberries and whipped cream.",
			    true,
			    5.59
			));

		pancakeHouseMenu.addChild(new MenuItem(
			    "French Toast Combo",
			    "French toast with two eggs and bacon.",
			    false,
			    6.99
			));

		pancakeHouseMenu.addChild(new MenuItem(
			    "Vegetarian Omelette",
			    "Three-egg omelette with spinach, mushrooms, and cheese.",
			    true,
			    7.49
			));

		pancakeHouseMenu.addChild(new MenuItem(
			    "Breakfast Burrito",
			    "Flour tortilla filled with eggs, sausage, and cheese.",
			    false,
			    6.29
			));

		pancakeHouseMenu.addChild(new MenuItem(
			    "Fruit & Yogurt Parfait",
			    "Layers of fresh fruit, granola, and yogurt.",
			    true,
			    4.99
			));

		cafeMenu.addChild(new MenuItem("Veggie Burger", "A juicy plant-based burger with lettuce, tomato, and vegan mayo.", true, 8.99));
		cafeMenu.addChild(new MenuItem("French Fries", "Crispy golden fries served with ketchup.", true, 3.49));
		cafeMenu.addChild(new MenuItem("Tomato Soup", "Rich and creamy tomato soup with a hint of basil.", true, 4.99));
		cafeMenu.addChild(new MenuItem("Chicken Burrito", "Grilled chicken with beans, rice, and cheese wrapped in a warm tortilla.", false, 9.49));
		cafeMenu.addChild(new MenuItem("Cheese Quesadilla", "Melted cheese in a toasted tortilla served with salsa.", true, 6.99));
		cafeMenu.addChild(new MenuItem("Chicken Nachos", "Loaded nachos topped with spiced chicken, jalapeños, and cheddar cheese.", false, 10.49));
		
		
		dinerMenu.addChild(new MenuItem("Vegetarian BLT", "Fakin’ Bacon with lettuce and tomato on whole wheat bread.", true, 5.99));

		dinerMenu.addChild(new MenuItem("Soup of the Day", "A bowl of the soup of the day, with a side of salad.", true, 4.29));

		dinerMenu.addChild(new MenuItem("Hotdog", "A grilled hotdog, served on a bun with sauerkraut, relish, onions, topped with cheese.",
				false, 3.99));

		dinerMenu.addChild(new MenuItem("Steamed Veggies and Brown Rice", "A medley of fresh steamed vegetables served over brown rice.", true,
				5.49));

		dinerMenu.addChild(new MenuItem("Pasta with Marinara Sauce", "Spaghetti with marinara sauce, and a slice of garlic bread.", true, 6.89));
		
		dinerMenu.addChild(desertMenu);
		
		desertMenu.addChild(new MenuItem("Brownie with Ice cream", "Chocolate Brownie serverd with vanilla ice cream along with hot fudge",
				false, 2.99));

		desertMenu.addChild(new MenuItem("Caramel chocolate cake", "A sweet cake topped with caramel and cadbury chocoilates.", true,
				3.49));

		desertMenu.addChild(new MenuItem("Tiuramisu", "An italian delicacy enriched with cofee and cheese.", false, 6.89));
		
		Waitress waitress= new Waitress(allMenus);
		waitress.printMenu();
		

	}

}
