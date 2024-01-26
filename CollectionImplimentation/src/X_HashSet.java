import java.util.HashSet;

public class X_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating a HashSet
		HashSet<String> hashSet = new HashSet<>();
		
		//Adding the elements
		hashSet.add("Element 1");
		hashSet.add("Element 2");
		hashSet.add("Element 3");

		System.out.print("Elements in HasSet: ");
		for(String item: hashSet) {
			System.out.print(item+" ");
		}
		
		System.out.println("\n");
		//Checking for existance
		boolean exists = hashSet.contains("Element 2");
		System.out.println("Checking the existance: "+exists);
		
		//Removing the element
		hashSet.remove("Element 2");
		
		System.out.print("\nElements in HashSet: ");
		for(String item: hashSet) {
			System.out.print(item+" ");
		}
	}

}
