package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	
	public void stringList () {
		List<String> list = new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("Cherry");
		list.add("Cherry");
		
		System.out.println("First element: "+list.get(0));
		System.out.println(list);

		for(String fruit: list) {
			System.out.println(fruit);
		}

	}
	
	public void intList() {
		List <Integer> list = new ArrayList<>();
		list.add(100);
		list.add(200);
		list.add(150);
	
		for(Integer Marks : list) {
		System.out.println(Marks);
	}}

	public static void main(String[] args) {

		ListExample a = new ListExample();
		a.stringList();
	//	a.intList();
	}

}
