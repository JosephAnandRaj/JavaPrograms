package Static;
public class Person {

	static String Name = "Joseph";
	static String Name2 = "Anand";
	static String Name3 = "Raj";

	
	public void TestA() {
		System.out.println(Name3);
	}

	public static void TestB() {
		System.out.println(Name);
		
	}

	public static void main(String[] args) {
		Person.TestB();
		String Topper = Name2;
		System.out.println(Topper);
	}

}
