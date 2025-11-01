package com.composite.housemerge;
import com.composite.housemerge.Menu;
import com.composite.housemerge.MenuComponent;
import com.composite.housemerge.Waitress;

public class MenuTestUpgraded {
	public static void main(String[] args) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu("PancakeHouseMenu","Breakfast");
        DinnerMenu dinerMenu = new DinnerMenu("DinerMenu","Dinner");
        CafeMenu cafeMenu = new CafeMenu("CafeMenu","Lunch");
        DessertMenu dessertMenu = new DessertMenu("DesertMenu","Desert");
     
        
     // Combine them all into a composite
        Menu allMenus = new Menu("ALL MENUS", "All menus combined");

        // Wrap individual menu classes as composite components
        allMenus.addChild(pancakeHouseMenu);
        allMenus.addChild(dinerMenu);
        allMenus.addChild(cafeMenu);
        cafeMenu.addChild(dessertMenu);
        Waitress waitress = new Waitress(allMenus);

        System.out.println("\n===== FULL MENU =====");
        waitress.printMenu();

		
	}

}
