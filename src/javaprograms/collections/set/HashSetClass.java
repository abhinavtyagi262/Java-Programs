package javaprograms.collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetClass {

	public static void main(String[] args) {
		
		Set<String> countries = new HashSet<String>();		//no duplicates are allowed and it is unsorted
		countries.add("India");
		countries.add("USA");
		countries.add("China");
		countries.add("Germany");
		countries.add("India");
		
		System.out.println(countries);
		
		for(String country : countries) {
			System.out.println(country);
		}		
	}
}
