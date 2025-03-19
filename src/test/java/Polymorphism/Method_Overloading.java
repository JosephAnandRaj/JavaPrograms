package Polymorphism;;

public class Method_Overloading {

	void sum(int a) {
	int sum = a+10;
	System.out.println(sum);
	}
	
	void sum (int b, int a ) {
	int sum = a+b;	
	System.out.println(sum);
	}
	
	public static void main(String[] args) {
		Method_Overloading Waiter = new Method_Overloading();
		Waiter.sum(10, 20);
		Waiter.sum(30);
		
	}

}
