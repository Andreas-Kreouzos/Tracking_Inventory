package inventory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItemCollection {
	
	private List<Item> items;
	 
	public List<Item> getItems() {
		return items = new ArrayList<Item>();
	}
	
	public void addItem() {
		Menus.getShowMenu();
	}
}