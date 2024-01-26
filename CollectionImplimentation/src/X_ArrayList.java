import java.util.ArrayList;

public class X_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating a arraylist
		ArrayList<String> arrayList = new ArrayList<>();
		
		//Adding elements
		arrayList.add("Element 1");
		arrayList.add("Element 2");
		arrayList.add("Element 3");
		
		//Accessing elements
		String element = arrayList.get(0);
		
		//Iterating through elements
		for(String item: arrayList) {
			System.out.println(item);
		}
		
		
		//Removing elements
		arrayList.remove("Element 2");
		
	}

}
