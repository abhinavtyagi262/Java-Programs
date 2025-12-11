package collections.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapClass {

	public static void main(String[] args) {
		
		Map<Integer, String> numbers = new TreeMap<>(); // key-value pairs are stored and it is sorted (key wise)
		numbers.put(1, "India");
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
