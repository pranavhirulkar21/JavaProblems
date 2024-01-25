// Write a Program to REVERSE THE ELEMENTS of an array?

import java.util.Scanner;

public class ReversedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of an array : ");
		int length = sc.nextInt();
		
		int arr[] = new int[length];
		System.out.println("Enter the "+length+" elements in array");
		for(int i=0; i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Before reversing the array ");
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]--->"+arr[i]);
			//System.out.print(arr[i]+" ");
		}
//		for(int i=0;i<arr.length/2;i++) {
//			int t = arr[i];
//			arr[i] = arr[arr.length-1-i];
//			arr[arr.length-1-i] = t;
//		}
//		System.out.println("After reversing the array ");
//		for(int i=0; i<arr.length;i++) {
//			System.out.println("arr["+i+"]--->"+arr[i]);
//		}
		System.out.println("After reversing the array ");
		for(int i=arr.length-1; i>=0; i--) {
			System.out.println("arr["+i+"]--->"+arr[i]);
		}
	}

}
