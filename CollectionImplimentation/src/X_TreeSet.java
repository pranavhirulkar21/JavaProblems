import java.util.TreeSet;

public class X_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating a TreeSet
		TreeSet<String> treeSet = new TreeSet<>();
		
		//Adding elements
		treeSet.add("Element 1");
		treeSet.add("Element 2");
		treeSet.add("Element 3");
		
		System.out.println("Elements in TreeSet: ");
		//Iterating through elements (in soretd order)
		for(String item: treeSet) {
			System.out.println(item);
		}
		
		//Removing elements
		treeSet.remove("Element 2");
		
	}

}
