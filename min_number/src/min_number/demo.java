package min_number;

import java.util.Arrays;
import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter size of array: ");
//		int size  = sc.nextInt();
//		
//		int[] num = new int[size];
//		System.out.println("Enter elements in an array: ");
//		for(int i=0; i<size; i++) {
//			System.out.print("Elements "+(i+1)+": ");
//			num[i] = sc.nextInt();
//		}
//		sc.close();
//		System.out.print("The Array is: ");
//		for(int number: num) {
//			System.out.print(number+" ");
//		}
		
		 int[] num = {2, 6, 4, 1, 5, 3, 8};

		 System.out.print("Array : ");
		 for(int i=0; i<num.length; i++) {
			 System.out.print(num[i]+ " ");
		 }
//		int min = num[0];
//		for(int i=0; i<num.length; i++) {
//			if(num[i]<min) {
//				min = num[i];
//			}
//		}
//		System.out.println();
//		System.out.print("Min no is: "+min);
		 int min = num[0];
		 for(int i=0; i<num.length; i++) {
			 if(num[i]<min) {
				 min = num[i];
			 }
		 }System.out.println();
		 System.out.println("Min no is: "+min);
		
		
//		int[] num1 = {2, 6, 4, 1, 5, 3, 8};
//		int[] num2 = new int[7];
//		System.out.print("num1: ");
//		for(int i=0; i<num1.length; i++) {
//			System.out.print(" "+num1[i]);
//		}
//		Arrays.sort(num1);
//		for(int i=0; i<num1.length; i++) {
//			num2[i]=num1[i];
//		}
//		System.out.println();
//		System.out.print("num2: ");
//		for(int i=0; i<num2.length; i++) {
//			System.out.print(" "+num2[i]);
//		}
		
	}
}
