package fibonacci;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0,c=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements in series : ");
		int n = sc.nextInt();

		System.out.println("Fibonacci Series of the number is : ");
		for(int i=0;i<n;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.print(a+" ");
		}
	}

}
