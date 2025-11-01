package com.composite.housemerge;

import java.util.*;

public class Menu extends MenuComponent {
	
	List<MenuComponent>  menuComponents= new ArrayList<>();
	String name;
	String description;
	

	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public void addChild(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}

	public void removeChild(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
		
	}
	public MenuComponent getChild(int index) {
		return menuComponents.get(index);
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
	
	public void print() {
		System.out.print("\n " + getName());
		System.out.print(" " + getDescription());
		System.out.println("\n-------------- ");
		
		for(MenuComponent menuComponent : menuComponents) {
			menuComponent.print();
		}

		
		}

	
}
