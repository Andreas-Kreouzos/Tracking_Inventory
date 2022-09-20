package inventory

import spock.lang.Specification
import spock.lang.Unroll

class ItemSpec extends Specification {
	
	@Unroll
	def "Item returns the name, serial & value"() {
		given:
		Item item = new Item(name,sn,value)
		
		expect:
		item.name == name
		item.sn == sn
		item.value == value
		
		where:
		name << ["name","name2"]
		sn << ["sn","sn2"]
		value << [1,2]
	}
	
	def "Item's name can't be null"() {
		when:
		Item item = new Item(null,"sn",BigDecimal.ZERO)
		
		then:
		Exception e = thrown(Exception)
		e.getMessage() == "Name cannot be null"
	}
	
	def "Item's name can't be empty"() {
		when:
		Item item = new Item("","sn",BigDecimal.ZERO)
		
		then:
		Exception e = thrown(Exception)
		e.getMessage() == "Name cannot be empty"
	}
	
	def "Item's serial can't be null"() {
		when:
		Item item = new Item("name",null,BigDecimal.ZERO)
		
		then:
		Exception e = thrown(Exception)
		e.getMessage() == "Serial number cannot be null"
	}
	
	def "Item's serial can't be empty"() {
		when:
		Item item = new Item("name","",BigDecimal.ZERO)
		
		then:
		Exception e = thrown(Exception)
		e.getMessage() == "Serial number cannot be empty"
	}
	
	def "Item's value can't be null"() {
		when:
		Item item = new Item("name","sn",null)
		
		then:
		Exception e = thrown(Exception)
		e.getMessage() == "Value of the item cannot be null"
	}
}
