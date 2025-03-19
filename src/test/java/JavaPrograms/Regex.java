package JavaPrograms;

public class Regex {
	
	String str1 = "Listen\tCarefully\nJoseph Anand Raj";
	String num = "Mobile No: 9976543210";
	
	public void replace() {
		String s2 = str1.replace("Joseph", "Jose");
		String s3 = num.replace("9", "5");

		System.out.println("Replace: "+s2);
		System.out.println("Replace: "+s3);

	}
	
	public void replaceAll() {
		String s1 = str1.replaceAll("J", "i");
		String s2 = num.replaceAll("9", "7");

		System.out.println(s1);
		System.out.println(s2);
	}
	
	public void s() {
		System.out.println("Before Regex S: "+str1);
		
		//Removes White spaces, new Lines, new tabs - \\s
		String s1 = str1.replaceAll("\\s", "");
		System.out.println("Regex S: "+s1);
	}
	
	public void d() {
		System.out.println("Before Regex d: "+num);
		
		// removes all digits - 123
		String s2 = num.replaceAll("\\d", "9");
		System.out.println("Regex d: "+s2);
	}
	
	
	
	
	

	public static void main(String[] args) {
		Regex r = new Regex();
	//	r.replace();
	//	r.replaceAll();
		r.s();
		r.d();

	}

}
