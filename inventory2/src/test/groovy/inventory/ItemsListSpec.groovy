package inventory

import spock.lang.Specification

class ItemsListSpec extends Specification {
	
	def "can create an ItemsList"(){
		expect:
		new ItemsList();
	}
	
	def "can create the ArrayList"(){
		when:
		ItemsList items = new ItemsList();
		
		then:
		items.getItems() == new ArrayList<Item>();
	}
}
