import java.util.TreeMap;

public class X_TreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating a TreeMap
		TreeMap<String, Integer> treeMap = new TreeMap<>();

		// Adding key-value pairs
		treeMap.put("Key 3", 3);
		treeMap.put("Key 1", 1);
		treeMap.put("Key 2", 2);

		System.out.println("Elements in TreeMap: ");
		// Iterating through key-value pairs(in sorted order)
		for (String key : treeMap.keySet()) {
			System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
		}

		// Removing key-value pairs
		treeMap.remove("Key 2");

	}

}
