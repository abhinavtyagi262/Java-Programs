package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterfaceSorting {
	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person("Alice", 30));
		people.add(new Person("Bob", 25));
		people.add(new Person("Charlie", 35));

		System.out.println("Original list: " + people);

		// Sort using the custom AgeComparator
		Collections.sort(people, new AgeComparator());

		System.out.println("Sorted by age: " + people);

		// You can also use a lambda expression for simpler comparators
		// Sort by name in ascending order
		Collections.sort(people, (p1, p2) -> p1.getName().compareTo(p2.getName()));
		System.out.println("Sorted by name (ascending): " + people);

		// Sort by name in descending order
		Collections.sort(people, (p1, p2) -> p2.getName().compareTo(p1.getName()));
		System.out.println("Sorted by name (descending): " + people);
	}
}

// A custom Comparator to sort Persons by age
class AgeComparator implements Comparator<Person> { // Comparator is a functional interface with only one abstract method i.e., compare(T o1, T o2)

	@Override
	public int compare(Person p1, Person p2) {
		// Returns a negative integer, zero, or a positive integer
		// as the first argument is less than, equal to, or greater than the second.
		return Integer.compare(p1.getAge(), p2.getAge());
	}
}

// A simple class to represent a Person
class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
