// Write a program to INSERT the ELEMENTS in an Array?

import java.util.Scanner;

public class InsertAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size : ");
		int length = sc.nextInt();
		
		int arr[] = new int[length];
		System.out.println("enter the " +length+ " elements");
		for(int i=0;i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length; i++) {
			System.out.println("arr["+i+"]--->" +arr[i]);
		}

	}

}
