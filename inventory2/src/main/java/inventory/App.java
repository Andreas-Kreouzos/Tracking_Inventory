/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inventory;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println(new App().getGreeting());
		
		ItemCollection.mapItem();
	}

	public String getGreeting() {
		return "Welcome to Tracking Inventory";
	}

}
