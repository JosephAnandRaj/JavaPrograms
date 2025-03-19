package JavaPrograms;

public class ReverseWord {

	String word = "India is Great and beautiful";

	
	public void reverseWordForloop() {
		String [] parts = word.split(" ");
		String reversed = "";

		for(int i = parts.length-1;i>=0;i--){
			 reversed = reversed+parts[i]+" ";
		}
		
		String reversed2 = reversed.trim();
		
		System.out.println(reversed2);
		System.out.println(reversed2.substring(0,1).toUpperCase()+reversed2.substring(1));
	}
	
	public void methodReverseWord() {
		String [] parts = word.split(" ");
		System.out.println(parts[2]+" "+parts[1]+" "+parts[0]);
		String caps = parts[1].substring(0,1).toUpperCase()+parts[1].substring(1);
		System.out.println(parts[2]+" "+caps+" "+parts[0]);
	}
	
	public static void main(String[] args) {
		ReverseWord r = new ReverseWord();
	//	r.methodReverseWord();
		r.reverseWordForloop();
	}

}
