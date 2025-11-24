package javaprograms.designpatterns.singleton;

public class MainClass {

	public static void main(String[] args) {

		SingletonClass singletonClass1 = SingletonClass.getInstance(); // same static instance is used everywhere
		SingletonClass singletonClass2 = SingletonClass.getInstance();

		singletonClass1.singletonClassMethod();

	}

}
