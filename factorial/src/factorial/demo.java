package factorial;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int fac =1;
		for(int i=1;i<=n;i++) {
			fac=fac*i;
		}
		System.out.println(fac);

	}

}
