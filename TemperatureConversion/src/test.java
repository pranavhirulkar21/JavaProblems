import java.util.Scanner;
/*
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int f, c;
		System.out.println("Select type of input to enter the temperature \n1.Fahrenheit \n2.Celsius");
		int code = sc.nextInt();
		if(code==1) {
			System.out.print("Enter temperature in Fahrenheit: ");
			f=sc.nextInt();
			c = (f-32)*5/9;
			System.out.print("\nThe temperature in Celsius: "+c);
		}
		else if(code==2) {
			System.out.print("Enter temperature in Celsius: ");
			c=sc.nextInt();
			f = (c*9/5)+32;
			System.out.print("\nThe temperature in Fahrenheit: "+f);
		}
		else {
			System.out.println("Invalid Input");
		}	
	}
}
*/

/*
public class test {

	static double fc(double f) {
		return (f - 32) * 5 / 9;
	}

	static double cf(double c) {
		return (c * 9 / 5) + 32;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the conversion direction: ");
		System.out.println("1. Fahrenheit to Celsius");
		System.out.println("2. Celsius to Fahrenheit");

		int choice = sc.nextInt();

//		System.out.print("Enter the value of Temperature: ");
//		double temp = sc.nextDouble();

		if (choice == 1 || choice == 2) {
			switch (choice) {
			case 1:
				System.out.print("Enter the value of Temperature: ");
				double temp1 = sc.nextDouble();
				double c = fc(temp1);
				System.out.println(temp1 + " Fahrenheit is equal to " + c + " Celsius");
				break;
			case 2:
				System.out.print("Enter the value of Temperature: ");
				double temp2 = sc.nextDouble();
				double f = cf(temp2);
				System.out.println(temp2 + " Celsius is equal to " + f + " Fahrenheit");
				break;

			default:
				System.out.println("Invalid Choice!");
			}
		} else {
			System.out.println("Invalid Choice. Choose between 1 or 2");
		}
		sc.close();
	}
}
*/

public class test {

	static double fc(double f) {
		return (f - 32) * 5 / 9;
	}

	static double cf(double c) {
		return (c * 9 / 5) + 32;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int choice;
		
		do{
			System.out.println("Choose the conversion direction: ");
			System.out.println("1. Fahrenheit to Celsius");
			System.out.println("2. Celsius to Fahrenheit");
			System.out.println("3. Exit");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter the value of Temperature: ");
				double temp1 = sc.nextDouble();
				double c = fc(temp1);
				System.out.println(temp1 + " Fahrenheit is equal to " + c + " Celsius");
				break;
				
			case 2:
				System.out.print("Enter the value of Temperature: ");
				double temp2 = sc.nextDouble();
				double f = cf(temp2);
				System.out.println(temp2 + " Celsius is equal to " + f + " Fahrenheit");
				break;

			case 3:
				System.out.println("Thank You!");
				choice=0;
				break;
				
			default:
				System.out.println("Invalid Choice!");
			}
		}
			while(choice != 0);
		
		sc.close();
	}
}