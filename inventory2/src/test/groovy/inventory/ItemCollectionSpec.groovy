package inventory

import spock.lang.Specification

class ItemCollectionSpec extends Specification {

	def "list have add an item ability"(){
		when:
		ItemCollection items = new ItemCollection();
		
		and:
		items.getItems() == new ArrayList<Item>();
		
		then:
		items.addItem()
		
	}
}
