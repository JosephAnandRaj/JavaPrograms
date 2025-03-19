package Returntype;

public class Return_String {

	public String getGreeting() {
		return "Welcome";
	}
	
	
	public static void main(String[] args) {

	   Return_String S = new Return_String();
	   String Greeting = S.getGreeting();
	   System.out.println(Greeting+" Joseph");
	}

}
