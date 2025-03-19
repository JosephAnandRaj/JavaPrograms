package JavaPrograms;

public class ReverseStringPalindrome {
	String name;
	String reversed = "";
	
	public void reverses(String name) {
	for(int i = name.length()-1;i>=0;i--) {
		reversed = reversed+name.charAt(i);
			}
	System.out.println(reversed);
	
	if(reversed.equals(name)) {
		System.out.println("it is a palindrome");
	}
	else {
		System.out.println("it is not a palindrome");
	}
	
	}
	
	public void test() {
		System.out.println(name.charAt(0));
		System.out.println(name.substring(0,2));
	}

	public static void main(String[] args) {
		ReverseStringPalindrome l = new ReverseStringPalindrome();
		l.reverses("My Name is Joseph");
	//	l.test();
	}

}
