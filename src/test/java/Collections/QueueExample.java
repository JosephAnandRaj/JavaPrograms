package Collections;

import java.util.LinkedList;
import java.util.Queue;


public class QueueExample {
	
	public void stringQueue() {
		Queue<String> queue = new LinkedList<>();
		
		queue.add("Joseph");
		queue.add("Anand");
		queue.add("Raj");
		
		System.out.println(queue);
	//	queue.poll();
	//	queue.peek();
		queue.remove();
		queue.add("James");
		System.out.println(queue);
		
		
		
		
	}
	

	public static void main(String[] args) {
		QueueExample q = new QueueExample();
		q.stringQueue();
		
	}

}
