package collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapClass {

	public static void main(String[] args) {
		
		Map<Integer, String> numbers = new LinkedHashMap<>(); // key-value pairs are stored and it is unsorted
		numbers.put(1, "India");							  // insertion order is maintained
		numbers.put(2, "USA");
		numbers.put(4, "China");
		numbers.put(5, "Germany");
		numbers.put(3, "India");
		
		System.out.println(numbers);
		
		for(Integer key : numbers.keySet()) {
			String country = numbers.get(key);
			System.out.println(key + "=" + country);
		}	
	}
}
