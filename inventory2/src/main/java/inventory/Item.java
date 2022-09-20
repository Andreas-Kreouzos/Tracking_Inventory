package inventory;

import java.math.BigDecimal;

public class Item {

	private String name;
	
	public void setName(String name) {
		this.name = name;
		nameNotNull(name);
		nameNotEmpty(name);
	}

	public String getName() {
		return name;
	}
	
	public void setSerialNumberSn(String sn) {
		
	}
	
	public void setAmount(BigDecimal amount) {
		
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
