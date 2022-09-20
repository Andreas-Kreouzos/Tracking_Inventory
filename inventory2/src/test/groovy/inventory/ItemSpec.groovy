package inventory

import spock.lang.Specification
import spock.lang.Unroll

class ItemSpec extends Specification {
	
	@Unroll
	def "item returns the name"() {
		given:
		Item item = new Item()
		
		when:
		item.setName(name)
		
		then:
		item.getName() == name
		
		where:
		name << ["name","name2"]
	}
	
	def "item take a serial number"(){
		given:
		String sn = "sn"
		
		and:
		Item item = new Item()
		
		expect:
		item.setSerialNumberSn(sn)
	}
	
	def "item takes an amount"(){
		given:
		Item item = new Item()
		
		expect:
		item.setAmount(BigDecimal.valueOf(10))
	}
}
