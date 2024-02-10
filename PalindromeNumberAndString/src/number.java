import java.util.Scanner;

public class number {

	public static void main(word[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter th number: ");
		int number = sc.nextInt();
		
		if(isPalindrome(number)) {
			System.out.println(number+" is a Palindrome.");
		} else {
			System.out.println(number+" is not Palindrome.");
		}
		sc.close();

	}

	private static boolean isPalindrome(int num) {
		// TODO Auto-generated method stub
		int originalNumber = num;
		int reversedNumber = 0;
		
		while(num>0) {
			int digit = num % 10;
			reversedNumber = reversedNumber *10 + digit;
			num = num/10;
		}
		
		return originalNumber == reversedNumber;
	}

}
