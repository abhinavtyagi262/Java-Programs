package javaprograms.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {

		Set<String> countries = new TreeSet<String>();		//no duplicates are allowed and it is sorted
		countries.add("India");
		countries.add("USA");
		countries.add("China");
		countries.add("Germany");
		countries.add("India");

		System.out.println(countries);

		for (String country : countries) {
			System.out.println(country);
		}
	}
}
