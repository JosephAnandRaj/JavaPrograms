package JavaPrograms;

public class Prime_Number {
	
	public static void main(String[] args) {
		if(isPrime(17)) {
			System.out.println("The given number is a Prime Number");
		}
		else {
			System.out.println("The given number is not a Prime Number");
		}
	}
	
	public static boolean isPrime(int n) {
		
		if(n<=1) {
			System.out.println("Kindly provide more than digit 1: ");
			return false;
		}
		
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
				}

			}
		return true;
		
		}
		
}	
		
	




