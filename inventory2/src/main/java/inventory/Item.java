package inventory;

import java.math.BigDecimal;

import exceptions.ItemNameCannotBeEmptyException;
import exceptions.ItemNameCannotBeNullException;
import exceptions.ItemSerialCannotBeEmptyException;
import exceptions.ItemSerialCannotBeNullException;
import exceptions.ItemValueCannotBeNullException;

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
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSn() {
		return sn;
	}
	
	public void setSn(String sn) {
		this.sn = sn;
	}
	
	public BigDecimal getValue() {
		return value;
	}
	
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	
	private void nameNotNull(String name) {
		if(name == null) {
			throw new ItemNameCannotBeNullException();
		}
	}

	private void nameNotEmpty(String name) {
		if("".equals(name)) {
			throw new ItemNameCannotBeEmptyException();
		}
	}
	
	private void serialNotNull(String sn) {
		if(sn == null) {
			throw new ItemSerialCannotBeNullException();
		}
	}
	
	private void serialNotEmpty(String sn) {
		if("".equals(sn)) {
			throw new ItemSerialCannotBeEmptyException();
		}
	}
	
	private void valueNotNull(BigDecimal value) {
		if(value == null) {
			throw new ItemValueCannotBeNullException();
		}
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", sn=" + sn + ", value=" + value + "]";
	}
	
	
}
