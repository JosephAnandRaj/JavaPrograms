package JavaPrograms;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


public class Numbers {

	public static void main(String[] args) {
		  Queue<Integer> queue = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

	        queue.add(queue.poll()); // Removes 1 and adds it to the end

	        System.out.println(queue); // Output: [2, 3, 4, 5, 1]
	}

}
