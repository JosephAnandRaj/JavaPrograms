package Returntype;

public class Return_Boolean {
	
	public boolean Add(int a,int b) {
		return a+b == 4;
	}
	
	public boolean Climate(String a) {
		return ("Sunny".equals(a) || "Rain".equals(a));
	}
	
	public boolean even(int a) {
		return a%2 == 0;
	}
	
	public boolean voteEligibility(int age) {
		return age==18;
		
	}

	public static void main(String[] args) {
		Return_Boolean b = new Return_Boolean();
		System.out.println("Add: "+b.Add(2, 2));
		System.out.println("Climate: "+b.Climate("Sunny"));
		System.out.println("Even: "+b.even(3));
		System.out.println("Age Eligibility: "+b.voteEligibility(19));
		
	}

}
