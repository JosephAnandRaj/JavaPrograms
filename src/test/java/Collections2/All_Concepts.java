package Collections2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class All_Concepts {
	
	String[] name = {"Joseph","Anand","Raj","Joseph"};
	Integer[] num = {79123456};
	String[] name1 = {"Joseph","Anand","Raj","Joseph"};
	Integer[] num1 = {1234};


	
	
	
	public void arrayList() {
		List<String> l = new ArrayList<>(Arrays.asList(name));
		System.out.println("Array List String: "+l);
		List<Integer> i = new ArrayList<>(Arrays.asList(num));
		System.out.println("Array List int: "+i);

		
	}
	
	public void linkedList() {
		List<String> l = new LinkedList<>(Arrays.asList(name));
		System.out.println("Linked List String: "+l);
		List<Integer> i = new LinkedList<>(Arrays.asList(num));
		System.out.println("Linked List int: "+i);
	}
	
	public void hashSet() {
		Set<String> s = new HashSet<>(Arrays.asList(name));
		System.out.println("HashSet String : "+s);
		Set<Integer> t = new HashSet<>(Arrays.asList(num));
		System.out.println("HashSet int : "+t);
	}
	
	public void linkedHashSet() {
		Set<String> s = new LinkedHashSet<>(Arrays.asList(name));
		System.out.println("LinkedHashSet String : "+s);
		Set<Integer> t = new LinkedHashSet<>(Arrays.asList(num));
		System.out.println("LinkedHashSet int : "+t);
	}
	
	public void treeSet() {
		Set<String> s = new TreeSet<>(Arrays.asList(name));
		System.out.println("LinkedHashSet String : "+s);
		Set<Integer> t = new TreeSet<>(Arrays.asList(num));
		System.out.println("LinkedHashSet int : "+t);
	}
	
	public void hashMap() {
		Map<String,Integer> m = new HashMap<>();
		for(int i=0;i<name1.length;i++) {
			m.put(name1[i],num1[i] );
		}
		System.out.println("HashMap : "+m);

		
		
	}
	
	public void linkedHashMap() {
		
	}
	
	public void treeMap() {
		
	}	
	
	public static void main(String[] args) {
		All_Concepts a = new All_Concepts();
		a.arrayList();
		a.linkedList();
		a.hashSet();
		a.linkedHashSet();
		a.treeSet();
		a.hashMap();
		a.linkedHashMap();
		a.treeMap();
	}

}
