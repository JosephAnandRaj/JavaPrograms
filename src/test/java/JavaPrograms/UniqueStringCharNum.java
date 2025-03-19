package JavaPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueStringCharNum {
	
	public void uniqueString() {
		
		Set<String> words = new HashSet<>(Arrays.asList("apple","banana","apple"));
		System.out.println("UniqueString without for loop: "+words);
	}
	
	public void uniqueString2() {
		
		String[] fruits = {"apple","orange","apple","orange","banana","grapes"};
		
		Set<String> uniqueString = new HashSet<>();
		
		for(int i=0;i<fruits.length;i++) {
			uniqueString.add(fruits[i]);
		}
		System.out.println("Unique String with for loop:"+uniqueString);

	}
	
	public void uniqueCharacters() {
		String Name = "Success";  // Java is case-sensitive, so S and s are considered as different characters.
		Set<Character> words = new HashSet<>();

		
		for(int i=0;i<Name.length();i++) {
			words.add(Name.charAt(i));
		}
		
		System.out.println("Unique Characters with case sensitive: "+words);
	
	}
	
	public void uniqueCharacters2() {
		String name = "success";
		Set<Character> words = new HashSet<>();

		
		for(int i=0;i<name.length();i++) {
			char d = name.charAt(i);
			words.add(d);
		}
		
		System.out.println("Unique Characters without case sensitive: "+words);

		
	}
	
	
	
	
	public void uniqueNumbers() {
		int[] num = {1,2,1,2,3,4,4};
		
		Set<Integer> uniquenum = new HashSet<>();
	
		for(int i=0; i<num.length; i++) {
			uniquenum.add(num[i]);
		}
		
		System.out.println("Uniquenumber: "+uniquenum);
	
	}


	public static void main(String[] args) {
		UniqueStringCharNum D = new UniqueStringCharNum();
		D.uniqueString();
		D.uniqueString2();

		D.uniqueCharacters();
		D.uniqueCharacters2();

		D.uniqueNumbers();
	}

}
