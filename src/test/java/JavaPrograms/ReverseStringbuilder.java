package JavaPrograms;

public class ReverseStringbuilder {
	
	public void method1() {
		String topper ="My Name is Joseph";
		
		StringBuilder sb = new StringBuilder(topper);
		StringBuilder sb1 = new StringBuilder("My Name is Joseph");
		sb.reverse();
		sb1.reverse();
		System.out.println("without for loop = "+sb);
	//	System.out.println(sb.toString() +sb1.toString()); //StringBuilder does not override the + operator like String.
															//	Instead of printing the reversed strings, it prints the memory reference of sb and sb1.
	}
	
	public void method2() {
		String topper =  "Joseph";
		
		
	}
	public static void main(String[] args) {
		ReverseStringbuilder s = new ReverseStringbuilder();
		s.method1();

	}

}
