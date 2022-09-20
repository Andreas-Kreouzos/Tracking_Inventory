package inventory

import spock.lang.Specification

class ItemSpec extends Specification {
	
	def "can create an Item"() {
		expect:
		new Item()
	}
	
	def "item takes a name"() {
		given:
		String name = "name"
		
		and:
		Item item = new Item()
		
		expect:
		item.setName(name)
	}
	
	def "item returns the name"() {
		given:
		Item item = new Item()
		
		when:
		item.setName("name")
		
		then:
		item.getName() == "name"
	}
	
	def "item take a serial number"(){
		given:
		String sn = "sn"
		
		and:
		Item item = new Item()
		
		expect:
		item.setSerialNumberSn(sn)
	}
	
	def "item takes an amount"(){
		given:
		Item item = new Item()
		
		expect:
		item.setAmount(BigDecimal.valueOf(10))
	}
}
