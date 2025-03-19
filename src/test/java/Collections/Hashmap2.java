package Collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Hashmap2 {
	
	public void method() {
		Map<String,Integer> word = new HashMap<>();
		word.put("apple", 1);
		word.put("apple", 2);
		System.out.println(word);
	}
	
	public void method2() {
		String words[] = {"apple","orange","banana"};
		Map <String, Integer> wordcount = new HashMap<>();
		
		wordcount.put("apple", 2);
		
		System.out.println(wordcount);

		if(wordcount.containsKey("apple")) {
			System.out.println("Apple found");
		}
		else {
			System.out.println("apple not found");
		}
	}
	
	  public void method3() {
			String words[] = {"apple","orange","banana","apple","apple"};
			Map <String, Integer> wordcount = new HashMap<>();
			
		for(String w: words) {
				wordcount.put(w, wordcount.getOrDefault(w, 0)+1);
			} 
		System.out.println(wordcount);
	}
	  
	  public void method4() {
		  String words[] = {"apple","banana","apple"};
		  Set<String> set = new HashSet<>();
		  
		  for (String w: words) {
			  set.add(w);
		  }
		  System.out.println(set);
		  
	  }
	  
	  public void method5() {
		  List <String> words = Arrays.asList("apple","banana","apple");
		  
		  Set<String> uniquewords = new HashSet<>();
		  Set<String> duplicates  = new HashSet<>();
		  
		  for(String word: words) {
			  if(!uniquewords.add(word)) {
				  duplicates.add(word);
			  }
			 }
		  System.out.println(duplicates);

	  
	  }
	

	public static void main(String[] args) {
		Hashmap2 h = new Hashmap2();
	//	h.method();
	//	h.method2();
		h.method3();
	//	h.method4();
    // h.method5();
	}

}
