import java.util.Arrays;

public class commonInTwoArray {
	static String[] findCommonElements(String[] arr1, String[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int size = Math.min(arr1.length, arr2.length);
		String[] commonElements = new String[size];
		
		int i=0, j=0, k=0;
		while(i<arr1.length && j<arr2.length) {
			int comparisonResult = arr1[i].compareTo(arr2[j]);
			
			if(comparisonResult == 0) {
				commonElements[k++] = arr1[i];
				i++;
				j++;
			} else if(comparisonResult < 0) {
				i++;
			} else {
				j++;
			}
		}
		return Arrays.copyOf(commonElements, k);
 	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr1 = {"apple", "banana", "orange", "kiwi"};
		String[] arr2 = {"orange", "kiwi", "grape", "pineapple"};
		
		String[] commonElements = findCommonElements(arr1, arr2);
		
		System.out.println("Common elements between the two arrays: "+Arrays.toString(commonElements));
		
	}

}
