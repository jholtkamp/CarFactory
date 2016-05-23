package eu.isential.app;

/**
 * CarFactory!
 * 
 * Factory Pattern
 * 
 * Main class
 *
 */


public class Main {

	public static void main(String[] args) {
		System.out.println("Hallo Main, de CarFactory werkt!!!");
		
		//creeer een CarFactory van type CarFactory
		CarFactory carfactory = new CarFactory();
		
		//maak (get...) object van BMW van het type Car en roep de methode drive() aan.
		Car bmw = carfactory.getCar("bmw");
		//en de aanroep van drive()
		bmw.drive();
	}

}
