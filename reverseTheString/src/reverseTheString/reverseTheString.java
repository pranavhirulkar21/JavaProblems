package reverseTheString;

import java.util.Scanner;

public class reverseTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = sc.nextLine();
		
		// 1. Using StringBuffer class
		StringBuffer sbf = new StringBuffer(str);
		System.out.println(sbf.reverse());
		
		
		// 2. Using iterative method
		char[] strArray = str.toCharArray();
		for(int i=strArray.length-1; i>=0; i--) {
			System.out.print(strArray[i]);
		}
		System.out.println();
		
		
		// 3. Using recursive method
		System.out.println(recursiveMethod(str));
		
	}

	 static String recursiveMethod(String str) {
		// TODO Auto-generated method stub
		 if((str == null) || (str.length() <= 1)) {
		return str;
		 }
		 return recursiveMethod(str.substring(1)) + str.charAt(0);
	}

}


/*
StringBuffer:
	Mutable: Unlike String, StringBuffer allows for modifications directly on the original string without creating new objects.
	Efficiency: More efficient for multiple modifications as it is mutable, reducing the overhead of creating new objects.
	Thread Safety: StringBuffer is thread-safe, allowing safe access and modification by multiple threads
*/