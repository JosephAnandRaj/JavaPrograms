package JavaPrograms;

public class SwapNumbers {
	
	int a = 10; 
	int b = 20;
	
	public void withouttemp2() {
		a = a*b; //a=200
		b = a/b; //b=10
		a = a/b;
	
		System.out.println("value of a is: "+a+" value of b is: "+b);

	}
	
	public void withouttemp() {
		 a = a+b; //a=30
		 b = a-b; //b=10
		 a = a-b; 
	
		 System.out.println("value of a is: "+a+" value of b is: "+b);

	}
	
	
	public void usingtemp() {
		
		int s=a;
		a=b;
		b=s;
		System.out.println("value of a is: "+a+" value of b is: "+b);
		
	}
	

	
	public static void main(String args[]) {
		SwapNumbers s = new SwapNumbers();
		s.usingtemp();
		//s.withouttemp();
		//s.withouttemp2();
	}

}
