import java.util.HashMap;

public class X_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating a HashMap
		HashMap<String, Integer> hashMap = new HashMap<>();
		
		//Adding key-value pairs
		hashMap.put("Key 1", 1);
		hashMap.put("Key 2", 2);
		hashMap.put("Key 3", 3);
		
		//Retrieving values
		int value = hashMap.get("Key 2");
		
		System.out.println("Elements in HashMap: ");
		//Iterating through key-value pairs
		for(String key: hashMap.keySet()) {
			System.out.println("Key: "+key+", Value: "+hashMap.get(key));
		}
		
		//Removing key-value pairs
		hashMap.remove("Key 2");
		

	}

}
