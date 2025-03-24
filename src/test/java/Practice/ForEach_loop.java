package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEach_loop {
	

	public static void normalfor() {
		int[] numbers = {10,20,30,40,50};

		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
	}
	
	public static void foreach() {
		int[] numbers = {10,20,30,40,50};

		for(int num : numbers) {
			System.out.println(num);
		}
	}
	
	public static void arrayList() {
		String [] Toppers = {"Joseph","Anand","Raj"};
		ArrayList<String> list = new ArrayList<>(Arrays.asList(Toppers));
		list.add("James");
		
		for(String name: list) {
			System.out.println(name);
		}
		
	}


	public static void main(String[] args) {
		//foreach();
		//normalfor();
		arrayList();
	}
	
}
