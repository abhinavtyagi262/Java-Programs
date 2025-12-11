package collections.list;

import java.util.List;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		
		List<String> countries = new Vector<>(); // insertion order is maintained
                                                 // Vector is slower than ArrayList
                                                 // Vector is synchronized
                                                 // Vector is thread safe
		countries.add("India");
		countries.add("USA");
		countries.add("China");
		countries.add("Germany");
		countries.add("India");
		
		System.out.println(countries); // printing object of list
		
		for(String country : countries) { // iteration using external for-each loop also known as enhanced for loop (works on element)
			System.out.println(country);
		}
		
		countries.forEach(country -> System.out.println(country)); // iteration using internal for-each loop (works on element) (Java 8 feature)
		
		for(int i=0; i<countries.size(); i++){ // iteration using for loop (works on index)
			System.out.println(countries.get(i));
		}	
	}
}