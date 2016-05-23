package eu.isential.app;



public class CarFactory {
	
	//get... methode om een obect van type Car te creeeren
	public Car getCar (String carType){
		
		return new BMW();
	}

}
