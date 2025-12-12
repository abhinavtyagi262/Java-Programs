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
		// Output: Original list: [Person [name=Alice, age=30], Person [name=Bob, age=25], Person [name=Charlie, age=35]]

		// Sort using the AgeComparator
		Collections.sort(people, new AgeComparator()); // Before Java 8
		System.out.println("Sorted by age: " + people);
		// Output: Sorted by age: [Person [name=Bob, age=25], Person [name=Alice, age=30], Person [name=Charlie, age=35]]
		
		
		// One line Comparator using Collections.sort method and lambda expression (AgeComparator)
		Collections.sort(people, (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge())); // Java 8 feature
		System.out.println("Sorted by age: " + people);
		// Output: Sorted by age: [Person [name=Bob, age=25], Person [name=Alice, age=30], Person [name=Charlie, age=35]]

		
		// One line Comparator using Collections.sort method and lambda expression (NameComparator)
		// Sort by name in ascending order
		Collections.sort(people, (p1, p2) -> p1.getName().compareTo(p2.getName()));
		System.out.println("Sorted by name (ascending): " + people);
		// Output: Sorted by name (ascending): [Person [name=Alice, age=30], Person [name=Bob, age=25], Person [name=Charlie, age=35]]

		// One line Comparator using Collections.sort method and lambda expression (NameComparator)
		// Sort by name in descending order
		Collections.sort(people, (p1, p2) -> p2.getName().compareTo(p1.getName()));
		System.out.println("Sorted by name (descending): " + people);
		// Output: Sorted by name (descending): [Person [name=Charlie, age=35], Person [name=Bob, age=25], Person [name=Alice, age=30]]
	}
}

// A custom Comparator to sort Persons by age
class AgeComparator implements Comparator<Person> { // Comparator is a functional interface with only one abstract method i.e., compare(T o1, T o2)

	@Override
	public int compare(Person p1, Person p2) {
		// Returns a negative integer, zero, or a positive integer
		// as the first argument is less than, equal to, or greater than the second.
		return Integer.compare(p1.getAge(), p2.getAge());
     // return p1.getAge() > p2.getAge() ? 1 : -1;    // alternate logic
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
