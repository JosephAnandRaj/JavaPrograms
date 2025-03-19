package JavaPrograms;

import java.util.Arrays;

public class Anagram {
	
	String str1 = "Listen\tCarefully\nJose ";
	String str2 = "Carefully Listen Jose";
	
	public void method() {

		String s1 = str1.replaceAll("\\s", "").toLowerCase();
		String s2 = str2.replaceAll("\\s", "").toLowerCase();
		
		if(s1.length()!=s2.length())
		{
		 System.out.println("The Given strings are not Anagrams at first");
		 return;
		}
		
			char[] arr1 = s1.toCharArray();
			char[] arr2 = s2.toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);

			
			if(Arrays.equals(arr1, arr2)) {
				System.out.println(s1+" "+s2+" are Anagrams");
			}
			else {
				System.out.println(s1+" "+s2+" are not Anagrams");
			}
		}
	
		
	

	public static void main(String[] args) {
		Anagram a = new Anagram();
		a.method();
		
	}

}
