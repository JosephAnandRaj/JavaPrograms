package JavaPrograms;

public class Palindrome {
	
	public void method1() {
		String s = "Madam";
		StringBuilder sb = new StringBuilder(s);
		String reverse = sb.reverse().toString();
		
		if(s.equalsIgnoreCase(reverse)) {
			System.out.println("it is palindrome");
		}
		else {
			System.out.println("it is not palindrome");
		}
		
	}

	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		p.method1();
	}

}
