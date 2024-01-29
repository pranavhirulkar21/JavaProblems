import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		int num, i, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		num = sc.nextInt();

		if (num == 1 || num == 0) {
			System.out.println(num + " is not prime");
		} else {
			for (i = 2; i < num; i++) {
				if (num % i == 0) {
					System.out.println(num + " is not prime number");
					count++;
					break;
				}
			}
			if (count == 0)
				System.out.println(num + " is a prime number");
		}
	}
}
