package Static;

public class Person2 {

	public void Test() {
		Person.TestB();
		System.out.println(Person.Name2);
		Person p = new Person();
		p.TestA();
			
	}
	
	public static void main(String[] args) {
	//	Person.TestB(); 
	//	System.out.println(Person.Name2); 

		Person2 p = new Person2();
		p.Test();
	}

}
