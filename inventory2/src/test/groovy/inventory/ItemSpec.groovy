package inventory

import spock.lang.Specification
import spock.lang.Unroll

class ItemSpec extends Specification {
	
	@Unroll
	def "item returns the name"() {
		given:
		Item item = new Item(name)
		
		expect:
		item.name == name
		
		where:
		name << ["name","name2"]
	}
	
	def "name cannot be null"() {
		when:
		Item item = new Item(null)
		
		then:
		Exception e = thrown(Exception)
		e.getMessage() == "Name cannot be null"
	}
	
	def "name cannot be empty"() {
		when:
		Item item = new Item("")
		
		then:
		Exception e = thrown(Exception)
		e.getMessage() == "Name cannot be empty"
	}
}
