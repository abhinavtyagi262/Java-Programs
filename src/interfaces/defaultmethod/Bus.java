package interfaces.defaultmethod;

public class Bus implements Vehicle {
	
	@Override
	public void vehicleMethod() {		//overriding default method	
		System.out.println("vehicleMethod of Bus");
	}

	@Override
	public void drive() {				//implementing abstract method
		System.out.println("Bus drive");
	}

}
