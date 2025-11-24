package javaprograms.collections.map;

import java.util.Hashtable;
import java.util.Map;

public class HashtableClass {

	public static void main(String[] args) {
		
		Map<Integer, String> numbers = new Hashtable<Integer, String>();	//key-value pairs are stored and it is unsorted
		numbers.put(1, "India");											//it does not allow null key or null value
		numbers.put(2, "USA");												//Hashtable is slower than HashMap
		numbers.put(4, "China");											//it is synchronized
		numbers.put(5, "Germany");											//it is thread safe
		numbers.put(3, "India");
		
		System.out.println(numbers);
		
		for(Integer key : numbers.keySet()) {
			String country = numbers.get(key);
			System.out.println(key + "=" + country);
		}	
	}
}
