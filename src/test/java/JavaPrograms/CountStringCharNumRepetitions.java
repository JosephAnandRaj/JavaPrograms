package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountStringCharNumRepetitions {
	
	public void printkeyandValue() {
		
		
		Map<String, Integer> wordcount = new HashMap<>();
		
		wordcount.put("Jose", 5);
		
		System.out.println(wordcount.get("Jose"));
		
	}
	
	
	
	public void charCount() {
			String words = "success";
			HashMap<Character, Integer> wordCount = new HashMap<>();
			 
			for (int i = 0; i < words.length(); i++) {
			char w = words.charAt(i); // Get character at index i
			
			if(wordCount.containsKey(w)) {
				wordCount.put(w, wordCount.get(w)+1);
			}
			else{
				wordCount.put(w, 1);
			}
			}
			 
			System.out.println(wordCount);
			}
	
	public static void wordCount() {
		
		String words = "Joseph is Successfull Person is Successfull";
		String[] parts = words.split(" ");
		
		Map<String, Integer> wordcount = new HashMap<>();
		
		for(int i=0;i<parts.length;i++) {
			String w = parts[i];
			if (wordcount.containsKey(w)) {
				wordcount.put(w, wordcount.get(w)+1);
			}
			else {
				wordcount.put(w, 1);
			}
		}
		System.out.println(wordcount);
	}
	
	public static void numCount() {
		int[] num = {1,2,3,1,5};
		
		Map<Integer, Integer> numcount = new HashMap<>();
		
		for(int i=0;i<num.length;i++) {
			int R = num[i];
			
			if(numcount.containsKey(R)) {
				numcount.put(R, numcount.get(R)+1);
			}
			else {
				numcount.put(R,1);
			}
		}
		System.out.println(numcount);
		
	}

        

    public static void main(String[] args) {
    	CountStringCharNumRepetitions c = new CountStringCharNumRepetitions();
    //	c.charCount();
    	c.wordCount();
    //	c.numCount();
    //	c.printkeyandValue();
    }

}
