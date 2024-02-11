import java.util.Scanner;

public class FilledBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			for(int j=0;j<n;j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		

	}

}
