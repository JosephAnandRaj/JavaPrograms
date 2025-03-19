package JavaPrograms;

public class ReverseStringloop {
	
	String Name = "Joseph Anand Raj";
	String reversed = "";
	
	public void ReverseString() {
		System.out.println(Name.charAt(3));  //charAt concept
		
		for (int i=Name.length()-1;i>=0;i--) {
		   reversed = reversed+Name.charAt(i);
		}
		
		System.out.println(reversed);
	}

	public static void main(String[] args) {
		ReverseStringloop r = new ReverseStringloop();
		r.ReverseString();
	}

}
