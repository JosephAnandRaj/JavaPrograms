package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basic {
	
	public void printList() {
		String [] Toppers = {"Joseph","Anand","Raj"};
		ArrayList<String> list = new ArrayList<>(Arrays.asList(Toppers));
		list.add("James");
		
		for(String name: list) {
			System.out.println(name);
		}
	}
	
	public void largestNumber() {
		int [] marks = {91,98,95,75,90};
		
		List<Integer> list = new ArrayList<>();
		
		for(int m: marks) {
			list.add(m);
		}
		
		System.out.println(list);
		
	}

	public static void main(String[] args) {
		Basic b = new Basic();
	//	b.printList();
		b.largestNumber();
		
	}

}
