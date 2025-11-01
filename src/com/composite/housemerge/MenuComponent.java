package com.composite.housemerge;

public abstract class MenuComponent {
	
	public void addChild(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}

	public void removeChild(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}

	
	public String getName() {
		throw new UnsupportedOperationException();
	}

	public String getDescription() {
		throw new UnsupportedOperationException();
	}

	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}
	public double getPrice() {
		throw new UnsupportedOperationException();
	}

	
	public void print() {
		throw new UnsupportedOperationException();	
		}

}

