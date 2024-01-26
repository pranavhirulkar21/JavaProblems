import java.util.LinkedList;
import java.util.Queue;

public class X_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating a Queue
		Queue<String> queue = new LinkedList<>();
		
		//Enqueue (adding elements)
		queue.add("Element 1");
		queue.add("Element 2");
		queue.add("Element 3");
		queue.add("Element 4");
		queue.add("Element 5");

		System.out.println("Elements in Queue: ");
		//Iterating through elements
		for(String item: queue) {
			System.out.println(item);
		}
		System.out.println(" ");
		
		//Dequeue (removing and returning the front element)
		String frontElement = queue.poll();
		System.out.println("Poll(): "+frontElement);
		
		//Checking the front element without removal
		String peekElement = queue.peek();
		System.out.println("Peek(): "+peekElement);
		
		System.out.println("\nElements in Queue: ");
		for(String item: queue) {
			System.out.println(item);
		}
	}

}
