package sorting;

import java.util.Arrays;
import java.util.List;

public class BubbleSort {

	// Main method to test the Bubble Sort
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(64, 34, 25, 12, 22, 11, 90);

		System.out.println("Original list: " + integers);
		// Output: Original list: [64, 34, 25, 12, 22, 11, 90]

		Integer[] array = integers.toArray(new Integer[integers.size()]);

		Integer[] sortedArray = bubbleSort(array); // Call the bubbleSort method
		List<Integer> sortedList = Arrays.asList(sortedArray);

		System.out.println("Sorted list (ascending): " + sortedList);
		// Output: Sorted list (ascending): [11, 12, 22, 25, 34, 64, 90]
	}

	// Method to perform Bubble Sort
	static Integer[] bubbleSort(Integer[] array) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) { // Outer loop for passes

			boolean swapped = false; // Flag to optimize: if no swaps in a pass, array is sorted

			for (int j = 0; j < n - i - 1; j++) { // Inner loop for comparisons and swaps
				// Compare adjacent elements
				if (array[j] > array[j + 1]) {
					// Swap array[j] and array[j+1]
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					swapped = true;
				}
			}
			// If no two elements were swapped by inner loop, then break
			if (!swapped) {
				break;
			}
		}
		return array;
	}

}
