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
}
