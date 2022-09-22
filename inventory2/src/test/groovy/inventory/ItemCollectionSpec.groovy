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
	
	def "can add item from the console"(){
		given:
		ItemCollection items = new ItemCollection();
		
		and:
		Scanner scanner = new Scanner(System.in)
		
		when:
		items.getItems() == new ArrayList<Item>();
		
		then:
		items.addItem(scanner)
	}
	
	def "print the Menus.getShowMenu() method"(){
		given:
		ItemCollection items = new ItemCollection();
		
		and:
		Scanner scanner = new Scanner(System.in)
		
		when:
		items.addItem(scanner)
		
		then:
		Menus.getShowMenu();
	}
}
