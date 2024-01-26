import java.util.PriorityQueue;

public class X_PriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating a Priority Queue
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		
		//Adding elements
		priorityQueue.add(3);
		priorityQueue.add(1);
		priorityQueue.add(2);
		
		for(int item: priorityQueue) {
			System.out.println(item);
		}
		
		//Polling (removing and returning the hightest priority elements)
		int highestPriorityElement = priorityQueue.poll();
		System.out.println(highestPriorityElement);
				

	}

}
