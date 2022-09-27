package inventory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ItemCollection {

	public static void mapItem() {
		Map<String, Object> map = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. Please insert the name of the item");
		String name = scanner.next();

		System.out.println("2. Please insert the serial number of the item");
		String sn = scanner.next();

		System.out.println("3. Please insert the value of the item");
		BigDecimal value = scanner.nextBigDecimal();

		Item item = new Item(name, sn, value);

		
		item.setName(name);
		item.setSn(sn);
		item.setValue(value);
		 

		map.put("name", item.getName());
		map.put("sn", item.getSn());
		map.put("value", item.getValue());
		System.out.println(map.size());
		System.out.println(map);
		System.out.println(item);
	}

	/*
	 * private List<Item> items;
	 * 
	 * public List<Item> getItems() { return items = new ArrayList<Item>(); }
	 * 
	 * public void addItem(Scanner scanner) {
	 * 
	 * System.out.println("1. Please insert the name of the item"); String name =
	 * scanner.next();
	 * 
	 * System.out.println("2. Please insert the serial number of the item"); String
	 * sn = scanner.next();
	 * 
	 * System.out.println("3. Please insert the value of the item"); BigDecimal
	 * value = scanner.nextBigDecimal();
	 * 
	 * Item item = new Item(name, sn, value); item.setName(name); item.setSn(sn);
	 * item.setValue(value); getItems().add(item);
	 * 
	 * items.size();
	 * 
	 * System.out.println(items.size()); }
	 */
}