package codingquestions;
import java.util.HashMap;
import java.util.Map;

public class FindOccurrences {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 2, 3, 1, 4, 2};
        
        // Find and display occurrences
        Map<Integer, Integer> occurrences = findOccurrences(arr);
        System.out.println(occurrences);
    }

    public static Map<Integer, Integer> findOccurrences(int[] arr) {
        // Instantiate a standard HashMap to hold numbers and their counts
        Map<Integer, Integer> map = new HashMap<>();

        // Loop through each number in the primitive array
        for (int num : arr) {
            // Check manual condition instead of predefined helper methods
            if (map.containsKey(num)) {
                // If the number already exists, pull the current count and increment it
                int currentCount = map.get(num);
                map.put(num, currentCount + 1);
            } else {
                // If the number is seen for the first time, initialize its count to 1
                map.put(num, 1);
            }
        }
        
        return map;
    }
}