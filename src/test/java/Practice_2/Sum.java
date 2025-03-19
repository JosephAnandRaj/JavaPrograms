package Practice_2;

public class Sum {
	
	public void sum (int a, int b) {
		int Total = a + b;
		System.out.println("Total = " +Total);
		System.out.println("Successfull");
	}
	
	public static void main (String args[]) {
	Sum waiter = new Sum();
	waiter.sum(10, 12);
	}
	
}