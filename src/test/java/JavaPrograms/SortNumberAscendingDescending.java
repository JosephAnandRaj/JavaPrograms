package JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortNumberAscendingDescending {
	
	public void usingArrays() {
		
		int [] num = {1,3,10,2,0,9};
		System.out.println("Before Sorting: "+Arrays.toString(num));
		Arrays.sort(num);
		System.out.println("After Sorting: "+Arrays.toString(num));
		System.out.println(Arrays.toString(num));
	}

	public void usingCollections() {
		
		List<Integer> l = new ArrayList<>(Arrays.asList(1,3,10,2,0,9));
		
		Collections.reverse(l);
		System.out.println("Reverse before Sorting: "+l);
		Collections.sort(l);
		System.out.println("Ascending: "+l);
		Collections.reverse(l);
		System.out.println("Reverse:"+l);
//		Collections.sort(l,Collections.reverseOrder());
//		System.out.println("Descending:"+l);
		
		
	}
	
	public static void main(String[] args) {
		SortNumberAscendingDescending s = new SortNumberAscendingDescending();
	//	s.usingArrays();
		s.usingCollections();
	}

}
