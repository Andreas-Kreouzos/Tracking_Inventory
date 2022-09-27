package inventory

import java.math.BigDecimal

import spock.lang.Specification

class ItemCollectionSpec extends Specification {

	def "Add Item with Scanner"(){
        
		given: 'Map contains one key-value pair'
        String key = 'key'
        Object value = 1
        
		and:
		def map = new HashMap()
        map.put(key, value)
        
		when: 'A value is found with the given key'
        def found = map.get(key)
        
		then: 'Should return the found value'
        found == value

	}
	
	def "Test the size of the map"(){
		
		given: 'A value is found with the given key'
		def map = new HashMap()
		
		when:
		map.put("name", "Sony")
		map.put("sn", "wert")
		map.put("value", 50)		

		then: 'Should return the found value'
		map.size() == 3

	}
	
	
/*	def "Test the sizey of the map"(){
		
		given: 'A value is found with the given key'
		def scanner = new Scanner(System.in)
		def map = new HashMap()
		
		and:
		String name = scanner.next()
		String sn = scanner.next();
		BigDecimal value = scanner.nextBigDecimal();
		Item item = new Item(name, sn, value);
		
		when:
		map.put("name", "name")
		map.put("sn", "sn")
		map.put("value", 50)

		then: 'Should return the found value'
		map.hasProperty(names) == 3

	}*/
	
	//TO-DO: Write tests that item and map has indeed contents
	
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
