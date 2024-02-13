import java.util.Scanner;

public class quadraticEquationRoots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the coefficient of a: ");
		double a = sc.nextDouble();
		
		System.out.println("Enter the coefficient of b: ");
		double b = sc.nextDouble();
		
		System.out.println("Enter the coefficient of c: ");
		double c = sc.nextDouble();
		
		double delta = b*b - 4*a*c;
		
		if(delta > 0) {
			double root1 = (-b+(Math.sqrt(delta))/2*a); 
			double root2 = (-b-(Math.sqrt(delta))/2*a);
			System.out.println("Roots 1 of x: "+root1);
			System.out.println("Roots 2 of x: "+root2);
		} else if(delta == 0) {
			double root = -b/(2*a);
			System.out.println("Root of x: "+root);
		} else {
			double realPart = -b/(2*a);
			double imgPart = Math.sqrt(Math.abs(delta))/(2*a);
			System.out.println("Root 1 of x: "+realPart+" + "+imgPart);
			System.out.println("Root 2 of x: "+realPart+" - "+imgPart);
		}

		sc.close();
	}

}
