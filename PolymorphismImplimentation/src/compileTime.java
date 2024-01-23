
class Calculator{
	int add(int a, int b) {
		return a + b;
	}
	 
	int add(int a, int b ,int c) {
		return a + b + c;
	}
	
	double add(double a, double b) {
		return a + b;
	}
}
public class compileTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator cal = new Calculator();
		int A = cal.add(2, 3);
		int B = cal.add(2, 3, 4);
		double C = cal.add(1.1, 2.2);
		
		System.out.println("Outputs of A, B, C are: "+A+" "+B+" "+C);
	}

}
