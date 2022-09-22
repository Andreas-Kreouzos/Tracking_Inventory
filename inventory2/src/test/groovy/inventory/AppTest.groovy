package inventory

import spock.lang.Specification

class AppTest extends Specification {
	
    def "application welcomes the user"() {
        setup:
        def app = new App()

        when:
        def result = app.greeting

        then:
        result == "Welcome to Tracking Inventory"
    }
}