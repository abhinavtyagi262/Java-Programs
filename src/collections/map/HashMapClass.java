package collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {

	public static void main(String[] args) {
		
		Map<Integer, String> numbers = new HashMap<>(); // key-value pairs are stored and it is unsorted
		numbers.put(1, "India");                        // HashMap allows one null key and multiple null values
		numbers.put(2, "USA");                          // HashMap is faster than Hashtable
		numbers.put(4, "China");                        // HashMap is not synchronized
		numbers.put(5, "Germany");                      // HashMap is not thread safe
		numbers.put(3, "India");
		
		System.out.println(numbers);
		
		for(Integer key : numbers.keySet()) {	// iteration using external for-each loop also known as enhanced for loop (works on element)
			String country = numbers.get(key);
			System.out.println(key + "=" + country);
		}
		
		numbers.forEach( (key, country) -> { 	// iteration using internal for-each loop (works on element) (Java 8 feature)
			System.out.println(key + "=" + country);   // -> (arrow symbol) is known as lambda
		});
	}
}
