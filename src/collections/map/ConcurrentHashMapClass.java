package collections.map;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapClass {

	public static void main(String[] args) {
		
		Map<Integer, String> numbers = new ConcurrentHashMap<>(); // key-value pairs are stored and it is unsorted
		numbers.put(1, "India");								  // concurrent read and write operations are allowed
		numbers.put(2, "USA");                                    // ConcurrentHashMap allows one null key and multiple null values
		numbers.put(4, "China");                                  // ConcurrentHashMap is slower than HashMap
		numbers.put(5, "Germany");                                // ConcurrentHashMap is synchronized
		numbers.put(3, "India");                                  // ConcurrentHashMap is thread safe
		
		System.out.println(numbers);
		
		for(Integer key : numbers.keySet()) {
			String country = numbers.get(key);
			System.out.println(key + "=" + country);
		}	
	}
}
