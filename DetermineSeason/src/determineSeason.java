import java.util.InputMismatchException;
import java.util.Scanner;

public class determineSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int monthNumber;
		boolean validInput = false;

		while (!validInput) {
			try {
				System.out.println("Enter the month number (1 to 12): ");
				monthNumber = sc.nextInt();

				if (monthNumber >= 1 && monthNumber <= 12) {
					validInput = true;
					String season = determineSeason(monthNumber);
					System.out.println("The season for month " + monthNumber + " is " + season);
				} else {
					System.out.println("Invalid Input! Month must be between 1 to 12");
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid Input! Please enter a valid integer.");
				sc.nextLine();
			}
		}
		sc.close();
	}

	static String determineSeason(int monthNumber) {
		switch (monthNumber) {
		case 2:
		case 3:
			return "Vasanta";
		case 4:
		case 5:
			return "Grishma / Summer";
		case 6:
		case 7:
			return "Monsoon / Rainy";
		case 8:
		case 9:
			return "Sharada";
		case 10:
		case 11:
			return "Hemanta";
		case 12:
		case 1:
			return "Shishira / Winter";
		default:
			return "Invalid month";
		}

	}

}
