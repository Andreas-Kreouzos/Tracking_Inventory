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
	
	def "can add item from the console"(){
		given:
		ItemsList items = new ItemsList();
		
		and:
		Scanner scanner = new Scanner(System.in)
		
		when:
		items.getItems() == new ArrayList<Item>();
		
		then:
		items.addItem(scanner)
	}
}
