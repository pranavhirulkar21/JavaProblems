import java.util.Scanner;

public class prrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		if(isPrime(number)) {
			System.out.println(number+" is a prime number.");
		} else {
			System.out.println(number+" is not a prime number.");
		}
		sc.close();
	}

	private static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		if(num<=1) {
			return false;
		}
		
		for(int i=2; i<=Math.sqrt(num);i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
