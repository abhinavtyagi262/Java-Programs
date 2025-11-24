package javaprograms.string;

import java.util.Scanner;

public class VowelEliminationClass {

	public static void main(String[] args) {
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		sc.close();

		vowelEliminationMethod1(string);
		vowelEliminationMethod2(string);
		vowelEliminationMethod3(string);
	}

	public static void vowelEliminationMethod1(String string) {
		// Vowel elimination using predefined method

		String stringWithoutVowels = string.replaceAll("a", "").replaceAll("e", "").replaceAll("i", "")
				.replaceAll("o", "").replaceAll("u", "").replaceAll("A", "").replaceAll("E", "").replaceAll("I", "")
				.replaceAll("O", "").replaceAll("U", "");
		System.out.println("String after vowelEliminationMethod1: " + stringWithoutVowels);
	}

	public static void vowelEliminationMethod2(String string) {
		// Vowel elimination using predefined method

		String regex = "[aeiouAEIOU]";
		String stringWithoutVowels = string.replaceAll(regex, "");
		System.out.println("String after vowelEliminationMethod2: " + stringWithoutVowels);
	}

	public static void vowelEliminationMethod3(String string) {
		// Vowel elimination without using predefined method

		String stringWithoutVowels = "";
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);

			// Check if the character is a vowel
			if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != 'A' && ch != 'E' && ch != 'I'
					&& ch != 'O' && ch != 'U') {
				stringWithoutVowels = stringWithoutVowels + ch; // Concatenate non-vowel characters
			}
		}
		System.out.println("String after vowelEliminationMethod3: " + stringWithoutVowels);
	}

}
