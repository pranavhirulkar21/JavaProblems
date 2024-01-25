// Write a program to DELETE AN ELEMENT OF A SPECIFIED INDEX IN THE EXISTING ARRAY?

import java.util.Scanner;

public class DeleteAtSpecifiedIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Length : ");
		int length = sc.nextInt();
		int arr[] = new int[length];
		System.out.println("Enter the "+length+ " elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("length of arry before deleting"+length+"--->"+arr.length);
		display(arr);
		System.out.println("Enter specified position for deleting that element");
		int in = sc.nextInt();
		arr=delete(arr,in);
		display(arr);
	}
	
	static void display(int a[]) {
		for(int i=0;i<a.length;i++)
		System.out.println(i+"--->"+a[i]);
	}
	static int[] delete(int a[],int in) {
		if(in>a.length || in<0) {
			System.out.println("Invalid Index");
			return a;
		} else {
			int na[] = new int[a.length-1];
			for(int i=0;i<in;i++) {
				na[i]=a[i];
			}
			for(int i=in;i<a.length;i++) {
				na[i-1]=a[i];
			}
			System.out.println("length of array after deleting"+"--->"+na.length);
			return na;
		}
	}

}
