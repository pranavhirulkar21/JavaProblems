import java.util.Scanner;

public class HallowBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
//				if(i==0 || j==0 || i==n-1 || j==n-1)
//					System.out.print("*");                  //Hollow Box
//				else
//					System.out.print(" ");
				
				
				if(i==0 || j==0 || i==n-1 || j==n-1 || i==j || i+j==n-1)
					System.out.print("*");					//Hollow Box With Cross In It
				else
					System.out.print(" ");
				
				
			}
			System.out.println();
		}

	}

}
