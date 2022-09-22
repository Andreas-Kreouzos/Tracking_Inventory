package inventory

import spock.lang.Specification

class ItemCollectionSpec extends Specification {
	
	def "can create an ItemsList"(){
		expect:
		new ItemCollection();
	}
	
	def "can create the ArrayList"(){
		when:
		ItemCollection items = new ItemCollection();
		
		then:
		items.getItems() == new ArrayList<Item>();
	}
	
	def "item takes a scanner"(){
		given:
		ItemCollection items = new ItemCollection();
		
		and:
		Scanner scanner = new Scanner(System.in)
		
		expect:
		items.addItem(scanner)
	}
	
	def "print the Menus.getShowMenu() method"(){
		expect:
		Menus.getShowMenu();
	}
}
