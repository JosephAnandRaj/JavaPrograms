package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetExample {
	
	public void stringSet() {
		Set<String> set = new HashSet<>(Arrays.asList("apple", "banana", "apple", "cherry", "banana", "date"));
		
		System.out.println(set);
	//	System.out.println(set.contains("Mango"));
	//	set.remove("Mango");
//		System.out.println(set);
		set.add("Strawberry");
		System.out.println(set);
		
		
	}

	public static void main(String[] args) {
		SetExample s = new SetExample();
		s.stringSet();
	}

}
