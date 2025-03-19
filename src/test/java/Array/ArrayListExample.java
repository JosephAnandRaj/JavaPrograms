package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class ArrayListExample {
	
	
	public void array() {
		String [] s = new String [5];
		s[0] = "Joseph";
		s[1] = "Anand";
		System.out.println(Arrays.toString(s));

	}
	
	public void arrayList() {
		ArrayList<String> list = new ArrayList<>();
		System.out.println("After Arraylist created: "+list);
		list.add("Joseph");
        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");
        list.add("David");
		System.out.println("After Added all data: "+list);
		System.out.println("Getting element at index 2 = "+list.get(1)); //get Index
		System.out.println("Replacing an element ="+list.set(1, "Anand")); //update Element
		System.out.println(list);
		System.out.println(list.remove("Bob")); //Remove an Element
		System.out.println(list.add("Raj"));
		System.out.println(list);
		System.out.println("Checking if list contains a specific element = "+list.contains("Charlie")); //check element exists
		System.out.println("Getting the size of the list = "+list.size()); //Get Size
		
		for (String s : list) {
			System.out.println(s);
		}
	}
	
	public void sortNumbers() {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(10);
		list.add(30);
		System.out.println("Before Sorting: "+list);
		Collections.sort(list);
		System.out.println("After Sorting: "+list);
		
		
	}
	
	public static void main(String[] args) {
		ArrayListExample a = new ArrayListExample();
	//	a.array();
		a.arrayList();
	//	a.sortNumbers();
		
	}

}
