import java.util.ArrayDeque;
import java.util.Deque;

public class X_Deque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating a Deque
		Deque<String> deque = new ArrayDeque<>();
		
		//Adding elements to the front and end
		deque.addFirst("Element 1");
		deque.addFirst("Element 2");
		deque.addFirst("Element 3");
		deque.addLast("Element 4");
		deque.addLast("Element 5");
		
		//Iterating through elements
		System.out.println("Elements in Deque: ");
		for(String item: deque) {
			System.out.println(item);
		}
		
		//Removing elements from the front and end
		String frontElement = deque.pollFirst();
		System.out.println("Removed front element: "+frontElement);
		
		String rearElement = deque.pollLast();
		System.out.println("Removed rear element: "+rearElement);
		
		//peek opeartions
		String peekFront = deque.peekFirst();
		System.out.println("Peeking front element: "+peekFront);
		
		String peekRear = deque.peekLast();
		System.out.println("Peeking rear element: "+peekRear);
		
		
		System.out.println("Elements in Deque: ");
		for(String item: deque) {
			System.out.println(item);
		}
	}

}
