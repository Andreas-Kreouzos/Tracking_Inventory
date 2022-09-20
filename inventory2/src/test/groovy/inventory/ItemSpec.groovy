package inventory

import spock.lang.Specification

class ItemSpec extends Specification {
	
	def "can create an Item"() {
		expect:
		new Item()
	}
}
