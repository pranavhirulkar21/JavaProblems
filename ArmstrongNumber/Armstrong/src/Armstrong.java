/*
  An Armstrong number is a number that is equal to the sum of its 
  own digits raised to the power of the number of digits in the number.
  Examples 153, 370, 371, 407 
 */

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, origNum, remainder, result=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		num = sc.nextInt();
		origNum = num;
		
		while(origNum != 0) {
			remainder = origNum % 10;
			result += Math.pow(remainder, 3);
			origNum /= 10;
		}
		
		if(result == num) {
			System.out.println(num + " is an Armstrong number.");
		} else {
			System.out.println(num + " is not Armstrong number.");
		}
		sc.close();

	}

}
