package inventory;

import java.math.BigDecimal;

public class Item {

	private String name;
	private String sn;
	private BigDecimal value;

	public Item(String name, String sn, BigDecimal value) {
		nameNotNull(name);
		nameNotEmpty(name);
		this.name = name;
		this.sn = sn;
		this.value = value;
	}

	public String getName() {
		return name;
	}
	
	private void nameNotNull(String name) {
		if(name == null) {
			throw new RuntimeException("Name cannot be null");
		}
	}

	private void nameNotEmpty(String name) {
		if("".equals(name)) {
			throw new RuntimeException("Name cannot be empty");
		}
	}
}
