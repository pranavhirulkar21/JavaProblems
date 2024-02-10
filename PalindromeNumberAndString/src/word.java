import java.util.Scanner;

public class word {
	
	private static boolean isPalindrome(String str) {
		// TODO Auto-generated method stub
		/*
		1st method
		StringBuilder reversed = new StringBuilder(str).reverse();
		return str.equals(reversed.toString());
		
		2nd method */
		int length = str.length();
		
		for(int i=0; i<length/2; i++) {
			if(str.charAt(i) != str.charAt(length -1 - i)) {
				return false;
			}
		}
		return true;
		
		
		
		
	}

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String: ");
		String inputString = sc.nextLine();
		
		if(isPalindrome(inputString)) {
			System.out.println("\""+inputString+"\" is a palindrome.");
		} else {
			System.out.println("\""+inputString+"\" is not a palindrome.");
		}
		sc.close();
	}

	

}
