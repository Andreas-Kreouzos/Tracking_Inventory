package inventory

import spock.lang.Specification

class ItemsListSpec extends Specification {
	
	def "can create an ItemsList"(){
		expect:
		new ItemsList();
	}
}
