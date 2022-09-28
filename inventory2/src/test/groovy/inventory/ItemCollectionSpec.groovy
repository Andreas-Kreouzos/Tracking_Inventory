package inventory

import exceptions.ItemNameCannotBeNullException
import java.math.BigDecimal

import spock.lang.Specification

class ItemCollectionSpec extends Specification {

	def "expect mapItem"(){
		when:
		new ItemCollection();
		
		then:
		ItemCollection.mapItem();
	}
	
	def "Return value from a key-pair"(){
        
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
	
	def "Test equality of maps regarless order"(){
		
		given:
		def map = new HashMap()
		map.put("name", "Sony")
		map.put("sn", "wert")
		map.put("value", 50)
		
		
		and:
		def expected = new HashMap()
		expected.put("sn", "wert")
		expected.put("name", "Sony")
		expected.put("value", 50)
		
		expect:
		map == expected
		
	}
}
