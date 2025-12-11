package polymorphism;

// program to demonstrate method overriding (runtime polymorphism) in java
// polymorphism means "many forms"
// method overriding: child class can redefine method of its parent class

public class RuntimePolymorphism {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.drive(); // Output: Vehicle drive

		Vehicle car = new Car();
		car.drive(); // Output: Car drive

		Vehicle bus = new Bus();
		bus.drive(); // Output: Bus drive
	}
}

class Vehicle { // parent class
	public void drive() {
		System.out.println("Vehicle drive");
	}
}

class Car extends Vehicle { // child class
	@Override
	public void drive() { // method overriding
		System.out.println("Car drive");
	}
}

class Bus extends Vehicle { // child class
	@Override
	public void drive() { // method overriding
		System.out.println("Bus drive");
	}
}
