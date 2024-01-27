import java.util.Scanner;

public class PrimeNumberFinder {
	static void findAndPrintPrimes(int start, int end) {
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Starting number of the range: ");
		int start = sc.nextInt();

		System.out.print("Enter the Ending number of the range: ");
		int end = sc.nextInt();

		// validate the range
		if (start >= 2 && start <= end) {
			System.out.println("Prime number in the range of " + start + " and " + end + " are ");
			findAndPrintPrimes(start, end);
		} else {
			System.out.println(
					"Invalid range. Please ensure the starting number is at least 2 and less then or equal to the ending number. ");
		}
		sc.close();
	}

}
