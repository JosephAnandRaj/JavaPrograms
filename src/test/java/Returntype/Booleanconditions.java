package Returntype;

public class Booleanconditions {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
		 // Equality
        System.out.println("Equality = "+(x == y));  // Output: false

        // Inequality
        System.out.println(x != y);  // Output: true

        // Greater than
        System.out.println(x > y);  // Output: false

        // Less than
        System.out.println(x < y);  // Output: true

        // Greater than or equal to
        System.out.println(x >= 10);  // Output: true

        // Less than or equal to
        System.out.println(y <= 20);  // Output: true

        // Logical AND
        System.out.println((x < y) && (y > 15));  // Output: true

        // Logical OR
        System.out.println((x > y) || (y > 15));  // Output: true

        // Logical NOT
        System.out.println(!(x == y));  // Output: true
	}

}
