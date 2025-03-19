package Constructor;

public class Person{
	
	int age;
	String lastName;
	
	public Person(int age,String lastname) {
		System.out.println(age);
		System.out.println(lastname);
	}
	
	public void Person2(int age1, String lastname1) {
		System.out.println(age1);
		System.out.println(lastname1);
	}
	
	public static void main(String args[]) {
		Person P = new Person(10,"Jose");
		P.Person2(11, "Anand");
	}
	
}