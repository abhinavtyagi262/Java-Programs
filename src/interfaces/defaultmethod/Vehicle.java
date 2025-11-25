package interfaces.defaultmethod;

public interface Vehicle {
	
	default void vehicleMethod() {		//default method
		System.out.println("vehicleMethod of Vehicle");
	}

	public void drive();				//abstract method

}
