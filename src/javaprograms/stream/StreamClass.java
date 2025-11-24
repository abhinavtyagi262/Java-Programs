package javaprograms.stream;

import java.util.*;
import java.util.stream.*;

// program to demonstrate the use of stream in java

public class StreamClass {

	public static void main(String args[]) {

		// create a list of integers
		List<Integer> integers = Arrays.asList(2, 3, 4, 5, 2);

		// demonstration of map method
		List<Integer> squaresList = integers.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println(squaresList); // Output: [4, 9, 16, 25, 4]

		// create a list of String
		List<String> names = Arrays.asList("Reflection", "Collection", "Stream", "Ram");

		// demonstration of map method
		List<String> capitalNames = names.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(capitalNames); // Output: [REFLECTION, COLLECTION, STREAM, RAM]

		// demonstration of filter method
		List<String> filteredNames = names.stream().filter(s -> s.startsWith("R")).collect(Collectors.toList());
		System.out.println(filteredNames); // Output: [Reflection, Ram]

		// demonstration of sorted method
		List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedNames); // Output: [Collection, Ram, Reflection, Stream]

		// collect method returns a set
		Set<Integer> squaresSet = integers.stream().map(x -> x * x).collect(Collectors.toSet());
		System.out.println(squaresSet); // Output: [16, 4, 9, 25]

		// demonstration of forEach method
		integers.stream().map(x -> x * x).forEach(y -> System.out.println(y));
		// Output: 4 9 16 25 4

		// demonstration of reduce method
		// Example 1: Summing all elements in the list
		// The initial value (0 for sum)
		// integers: [2, 3, 4, 5, 2]
		int sum = integers.stream().reduce(0, (currentSum, integer) -> currentSum + integer);
		System.out.println("Sum of numbers: " + sum); // Output: Sum of numbers: 16

		// Example 2: Multiplying all elements in the list
		// The initial value (1 for product)
		int product = integers.stream().reduce(1, (currentProduct, integer) -> currentProduct * integer);
		System.out.println("Product of numbers: " + product); // Output: Product of numbers: 240

		// Example 3: Concatenating all the strings in the list
		// The initial value ("" for concatenatedString)
		List<String> words = Arrays.asList("Java", "Stream", "API");
		String concatenatedString = words.stream().reduce("", (currentString, word) -> currentString + word);
		System.out.println("Concatenated String: " + concatenatedString); // Output: Concatenated String: JavaStreamAPI
	}
}
