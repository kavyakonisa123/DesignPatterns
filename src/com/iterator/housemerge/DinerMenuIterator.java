package com.iterator.housemerge;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem>{
	MenuItem[] items;
	int position = 0;


	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}
	
	public boolean hasNext() {
		if(position >= items.length || items[position] == null) return false;
		else return true;
	}


	public MenuItem next() {
		MenuItem menuItem = items[position];
		position= position+1;
		return menuItem;
	}
	
	public void remove() {
		throw new UnsupportedOperationException("You shouldn't be trying to remove the operation");
	}

}
