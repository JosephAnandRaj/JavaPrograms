package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashmapExample {
	
	public void stringHashmap() {
	
	Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "Red");
		map.put(2, "Green");
		map.put(3, "Orange");
		map.put(2, "Green");
		
		System.out.println(map);
		System.out.println(map.get(2));
		map.remove(2);
		System.out.println(map);

			
	}
	public static void main(String[] args) {
		HashmapExample h = new HashmapExample();
		h.stringHashmap();
	}

}
