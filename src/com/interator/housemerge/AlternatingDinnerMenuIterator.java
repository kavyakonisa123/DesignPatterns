package com.interator.housemerge;

import java.util.Calendar;
import java.util.Iterator;

public class AlternatingDinnerMenuIterator implements Iterator<MenuItem>{
	MenuItem[] items;
	int position = 0;


	public AlternatingDinnerMenuIterator(MenuItem[] items) {
		this.items = items;
		this.position = Calendar.DAY_OF_WEEK %2;
	}
	
	public boolean hasNext() {
		if(position >= items.length || items[position] == null) return false;
		else return true;
	}


	public MenuItem next() {
		MenuItem menuItem = items[position];
		position= position+2;
		return menuItem;
	}
	
	public void remove() {
		throw new UnsupportedOperationException("You shouldn't be trying to remove the operation");
	}

}
