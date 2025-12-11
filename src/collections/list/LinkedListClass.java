package collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {

    public static void main(String[] args) {

        List<String> countries = new LinkedList<>(); // insertion order is maintained
                                                     // LinkedList is not synchronized
                                                     // LinkedList is not thread safe

        // LinkedList internally uses doubly linkedlist datastructure to store the elements in it
        // LinkedList has slower get() and set() operations than ArrayList
        // LinkedList has faster add() and remove() operations than ArrayList

        // doubly linkedlist datastructure is represented using nodes, where each node has three fields: [Previous Node Pointer, Data, Next Node Pointer]
        // Previous Node Pointer stores address of the previous node
        // Next Node Pointer stores address of the next node

        countries.add("India"); // using add() method
        countries.add("USA");
        countries.add("China");
        countries.add("Germany");
        countries.remove("Germany");// using remove() method
        countries.add(2, "Pakistan"); // adding Pakistan at 2nd index
        countries.remove(2); // removing element from 2nd index
        countries.addFirst("Africa"); // adding first element
        countries.addLast("Nepal"); // adding last element
        countries.removeFirst(); // removing first element
        countries.removeLast(); // removing last element

        System.out.println("printing object of list: " + countries);    // printing object of list: [India, USA, China]

        System.out.println(countries.size()); // Output: 3
        System.out.println(countries.contains("India")); // Output: true

        for(String country : countries) {			// iteration using external for-each loop also known as enhanced for loop (works on element)
            System.out.println(country);
        }

        countries.forEach(country -> System.out.println(country)); // iteration using internal for-each loop (works on element) (Java 8 feature)

        for(int i=0; i<countries.size(); i++){			// iteration using for loop (works on index)
            System.out.println(countries.get(i));
        }
    }
}
