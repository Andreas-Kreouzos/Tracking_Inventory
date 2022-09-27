package inventory

import spock.lang.Specification

class ItemCollectionSpec extends Specification {

	def "Add Item with Scanner"(){
		setup:
		Scanner scanner = new Scanner(System.in)
		ItemCollection items = new ItemCollection()

		when:
		def result = items.getItems().size()
		items.addItem(scanner)

		then:
		result < items.getItems().size()
	}
	
/*	def "list of items to json"() {
		given:
		List<Item> items = new ArrayList() // List of items 
//		items.add
		
		when:"generating a json from the list"
		def json = JsonConverter.itemsToJson(items)
		
		then:
		json == "{items}"
		
	}*/
}
