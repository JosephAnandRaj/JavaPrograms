package Returntype;

public class BooleanCondtions_String {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World";
		String str3 = "Hello";

		// Equality using .equals()
		System.out.println("Equality (str1 == str2): " + str1.equals(str2));  // Output: false
		System.out.println("Equality (str1 == str3): " + str1.equals(str3));  // Output: true

		// Inequality using !.equals()
		System.out.println("Inequality (str1 != str2): " + !str1.equals(str2));  // Output: true
		System.out.println("Inequality (str1 != str3): " + !str1.equals(str3));  // Output: false

		// Greater than (lexicographically) using compareTo()
		System.out.println("Greater than (str1 > str2): " + (str1.compareTo(str2) > 0));  // Output: false

		// Less than (lexicographically) using compareTo()
		System.out.println("Less than (str1 < str2): " + (str1.compareTo(str2) < 0));  // Output: true

		// Greater than or equal to (lexicographically) using compareTo()
		System.out.println("Greater than or equal to (str1 >= str3): " + (str1.compareTo(str3) >= 0));  // Output: true

		// Less than or equal to (lexicographically) using compareTo()
		System.out.println("Less than or equal to (str1 <= str3): " + (str1.compareTo(str3) <= 0));  // Output: true

		// Logical AND
		System.out.println("Logical AND (str1 equals 'Hello' && str2 equals 'World'): " 
				+ (str1.equals("Hello") && str2.equals("World")));  // Output: true

		// Logical OR
		System.out.println("Logical OR (str1 equals 'Hello' || str2 equals 'Hello'): " 
				+ (str1.equals("Hello") || str2.equals("Hello")));  // Output: true

		// Logical NOT
		System.out.println("Logical NOT (!str1.equals(str2)): " + !str1.equals(str2));  // Output: true
	}
}

