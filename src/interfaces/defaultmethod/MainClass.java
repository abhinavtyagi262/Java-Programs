package interfaces.defaultmethod;

public class MainClass {

	public static void main(String[] args) {
		Vehicle car = new Car();
		car.vehicleMethod();	//calling default method
		car.drive();			//calling abstract method	
		
		Vehicle bus = new Bus();
		bus.vehicleMethod();	//calling overridden default method
		bus.drive();			//calling abstract method
		
	}

}
