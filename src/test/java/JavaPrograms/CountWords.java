package JavaPrograms;

public class CountWords {
	
	String Sentence = "   Hello,   this   is a   Java program!  ";
	
	public void words() {
		String[] words = Sentence.trim().split("\\s+");
		int wordCount = words.length;
		System.out.println("The Total words in the Sentence: "+wordCount);
	}

	public static void main(String[] args) {
		CountWords c = new CountWords();
		c.words();
	}

}
