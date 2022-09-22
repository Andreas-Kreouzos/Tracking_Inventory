package inventory

import spock.lang.Specification

class AppTest extends Specification {
	
    def "application welcomes the user"() {
        setup:
        def app = new App()

        when:
        def result = app.greeting

        then:
        result != null
    }
	
	def "provide the options menu to the user"() {
		given:
        App app = new App()
		
		expect:
		app.getShowMenu()
	}

}