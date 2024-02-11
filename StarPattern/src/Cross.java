import java.util.Scanner;

public class Cross {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <n; j++) {
				if (i == j || i+j==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
