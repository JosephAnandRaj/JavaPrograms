package Returntype;

public class Person2 {
	
	int num_a = 10;
	int num_b = 20; 
	
	public int sum() {
		int Total = num_a+num_b;
		return Total;
	}

	public static void main(String[] args) {

		Person2 p = new Person2();
		int Add = p.sum();
		System.out.println(Add);
	}

}
