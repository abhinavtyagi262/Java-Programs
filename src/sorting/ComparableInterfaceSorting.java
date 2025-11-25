package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableInterfaceSorting {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 92));
        students.add(new Student("Charlie", 78));
        students.add(new Student("David", 85)); // Same marks as Alice

        System.out.println("Students before sorting:" + students);

        // Sort the list of Student objects using their natural ordering
        Collections.sort(students);

        System.out.println("Students after sorting by marks (ascending): " + students);
    }
}

// Define a Student class that implements Comparable to enable natural sorting by marks
class Student implements Comparable<Student> { // Comparable is a functional interface with only one abstract method i.e., compareTo(T o)
	
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Implement compareTo to define the natural ordering (by marks in ascending order)
    @Override
    public int compareTo(Student that) {
        // Returns a negative integer if this object is less than 'that'
        // Returns zero if this object is equal to 'that'
        // Returns a positive integer if this object is greater than 'that'
        return this.marks - that.marks;
     // return this.marks > that.marks ? 1 : -1;    // alternate logic
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", marks=" + marks + "]";
    }
}
