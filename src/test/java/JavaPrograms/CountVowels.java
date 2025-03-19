package JavaPrograms;

public class CountVowels {
	
	String Sentence = "Hi My Name is Joseph";
	int vowelsCount = 0;
	
	public void method() {
		
	
		for(int i=0;i<Sentence.length();i++) {
			char letter = Sentence.charAt(i);
			
			if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u') {
				vowelsCount++;
			}
			
		}
		System.out.println("The Vowels present in the Sentence is: "+vowelsCount);
	}
	public static void main(String[] args) {
		CountVowels c = new CountVowels();
		c.method();
	}

}
