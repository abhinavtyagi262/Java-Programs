package javaprograms.polymorphism;

// program to demonstrate method overloading (compile-time polymorphism) in java
// polymorphism means "many forms"
// method overloading: multiple methods with same name but different parameters

public class CompiletimePolymorphism {

	public static void main(String[] args) {
		Calculator calc = new Calculator();

		System.out.println("Sum of two integers: " + calc.add(5, 10));
		System.out.println("Sum of three integers: " + calc.add(5, 10, 15));
		System.out.println("Sum of one integer and one double: " + calc.add(5, 10.2));
	}
}

class Calculator {
	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) { // method overloading by changing the number of parameters
		return a + b + c;
	}

	public double add(int a, double b) { // method overloading by changing the datatype of parameter
		return a + b;
	}

//	public void add(int a, int b) { // method overloading cannot be achieved by changing only return type
//		 int c = a + b;
//		 System.out.println("Sum of two integers: " + c);
//	}

}
