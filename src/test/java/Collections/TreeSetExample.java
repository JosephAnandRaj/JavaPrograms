package Collections;

import java.util.TreeSet;

public class TreeSetExample {
	
	public void stringTreeSet() {
		TreeSet <Integer> treeset = new TreeSet<>();
		treeset.add(100);
		treeset.add(99);
		treeset.add(10);
		System.out.println(treeset);
		treeset.remove(99);
		System.out.println(treeset);
		treeset.add(200);
		System.out.println(treeset);
	}

	public static void main(String[] args) {
		TreeSetExample t = new TreeSetExample();
		t.stringTreeSet();
		
	}

}
