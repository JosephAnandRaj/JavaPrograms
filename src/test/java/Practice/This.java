package Practice;

public class This {

	int a = 10;
	int b = 20;
	
	public void add(){
		int a = 5;
		int b = 6;
		int sum = this.a+this.b;
		int sum1 = a+b;
		System.out.println("Sum = "+sum);
		System.out.println("Sum 1 = "+sum1);
	}
	
	public void sub() {
		int sub = a-b;
		System.out.println("Sub = "+sub);
	}
	
	
	
	public static void main(String[] args) {

		This T = new This();
		T.add();
		T.sub();
	}

}
