package JavaPrograms;

public class Factorial {

	public static void main(String[] args) {
			facto(5);
	}
	
	public static void facto(int n) {
	
		int fact = 1;

		for(int i=n;i>=1;i--) {
		  
		  fact = fact * i;
		//  fact  *= i;
		}
		
		System.out.println("The Factorial of "+n+" is: "+fact);
	}

}
