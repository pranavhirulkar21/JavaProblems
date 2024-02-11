import java.util.Scanner;

public class EquilateralTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int i;
		int j;
		
		for (i=0;i<n;i++) {
			System.out.print(" ");
		
			for (j=0;j<=i;j++) {
				System.out.print("*");
			}
			
			System.out.println( );
		}
	}
}

