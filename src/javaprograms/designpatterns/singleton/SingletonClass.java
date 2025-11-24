package javaprograms.designpatterns.singleton;

public class SingletonClass {

	private SingletonClass() { // 1) Creating private constructor

	}

	static SingletonClass singletonClass = new SingletonClass(); // 2) Creating static instance of class

	public static SingletonClass getInstance() { // 3) Creating static method to return the static instance
		return singletonClass;
	}

	public void singletonClassMethod() {
		System.out.println("singletonClassMethod is executed");
	}

}
