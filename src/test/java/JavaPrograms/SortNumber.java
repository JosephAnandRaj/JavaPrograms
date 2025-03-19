package JavaPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class SortNumber {
	
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
		SortNumber a = new SortNumber();
		a.sortNumbers();


	}

}
