package string;

public class PredefinedMethods {

    public static void main(String[] args) {

        // 1) length() method
        "Java Programming".length(); // Output: 16

        // 2) charAt() method
        char ch = "Java Programming".charAt(0); // ch: 'J'

        // 3) equals() method and ==
        String str1 = "Java Programming";
        String str2 = "Java Programming";
        String str3 = new String("Java Programming");
        String str4 = new String("Java Programming");
        boolean referencesEqual1 = (str1 == str2); // referencesEqual1: true
        boolean referencesEqual2 = (str3 == str4); // referencesEqual2: false // == compares objects' references

        boolean valuesEqual1 = str1.equals(str2); // valuesEqual1: true
        boolean valuesEqual2 = str3.equals(str4); // valuesEqual2: true // equals() method compares objects' values

        // 4) equalsIgnoreCase() method
        "Java Programming".equalsIgnoreCase("java programming"); // Output: true

        // 5) contains() method
        "Java Programming".contains("Program"); // Output: true

        // 6) startsWith() method
        "Java Programming".startsWith("Java"); // Output: true

        // 7) endsWith() method
        "Java Programming".endsWith("ing"); // Output: true

        // 8) indexOf() method
        "Java Programming".indexOf("Program"); // Output: 5

        // 9) lastIndexOf() method
        "Java Programming Java".lastIndexOf("Java"); // Output: 17

        // 10) substring() method
        "Java Programming".substring(5,8); // including 5, excluding 8
        // Output: Pro

        // 11) replace() method
        "Java Programming Java".replace("Java", "C"); // Output: C Programming C

        // 12) replaceAll() method (Also works with regular expressions)
        "Java Programming Java".replaceAll("[aeiouAEIOU]", ""); // Eliminating vowels from a string
        // Output: Jv Prgrmmng Jv

        // 13) concat() method and +
        "Java ".concat("Programming"); // Output: Java Programming
        String str = "Java " + "Programming"; // Output: Java Programming

        // 14) trim() method
        "  Java Programming  ".trim(); // Output: Java Programming

        // 15) toUpperCase() method
        "Java Programming".toUpperCase(); // Output: JAVA PROGRAMMING

        // 16) toLowerCase() method
        "Java Programming".toLowerCase(); // Output: java programming
    }
}
