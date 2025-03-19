package JavaPrograms;

public class Return {
	
	public String checkEvenorOdd(int n) {
		if (n%2==0) {
			return "even";
		}
		else {
			return "odd";
		}
	}
	
	public boolean checkEvenorOdds(int n) {
		if(n%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int findmax(int a, int b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
		
	}

	public static void main(String[] args) {
		Return e = new Return();
		System.out.println(e.checkEvenorOdd(10));
		System.out.println(e.checkEvenorOdds(2));
		System.out.println(e.findmax(2, 3));
	}

}
