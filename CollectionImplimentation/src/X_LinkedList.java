import java.util.LinkedList;

public class X_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating a linkedlist
		LinkedList<String> linkedList = new LinkedList<>();
		
		//Adding elements
		linkedList.add("Element 1");
		linkedList.add("Element 2");
		linkedList.add("Element 3");
		
		//Accessing elements
		String element = linkedList.get(0);
		
		//Iterating through elements
		for(String item: linkedList) {
			System.out.println(item);
		}
		System.out.println();
		
		//Removing element
		linkedList.remove("Element 2");
		
	}

}
