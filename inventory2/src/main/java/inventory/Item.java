package inventory;

import java.math.BigDecimal;

public class Item {

	private String name;
	private String sn;
	private BigDecimal value;

	public Item(String name, String sn, BigDecimal value) {
		nameNotNull(name);
		nameNotEmpty(name);
		serialNotNull(sn);
		serialNotEmpty(sn);
		valueNotNull(value);
		this.name = name;
		this.sn = sn;
		this.value = value;
	}

	public String getName() {
		return name;
	}
	
	public String getSn() {
		return sn;
	}
	
	public BigDecimal getValue() {
		return value;
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
	
	private void serialNotNull(String sn) {
		if(sn == null) {
			throw new RuntimeException("Serial number cannot be null");
		}
	}
	
	private void serialNotEmpty(String sn) {
		if("".equals(sn)) {
			throw new RuntimeException("Serial number cannot be empty");
		}
	}
	
	private void valueNotNull(BigDecimal value) {
		if(value == null) {
			throw new RuntimeException("Value of the item cannot be null");
		}
	}
}
