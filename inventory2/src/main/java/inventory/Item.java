package inventory;

import java.math.BigDecimal;

public class Item {

	private String name;
	
	public void setName(String name) throws Exception {
		this.name = name;
		if(name == null) {
			throw new Exception("Name cannot be null");
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setSerialNumberSn(String sn) {
		
	}
	
	public void setAmount(BigDecimal amount) {
		
	}
}
