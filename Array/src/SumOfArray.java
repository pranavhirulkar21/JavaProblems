import java.util.Scanner;

public class SumOfArray {

	public static int ArraySum(int Array[], int length) {
		int sum = 0;
		for(int i=0; i<length; i++) {
			sum += Array[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size : ");
		int length = sc.nextInt();
		int sum = 0;
		
		int arr[] = new int[length];
		System.out.println("enter the " +length+ " elements");
		for(int i=0;i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length; i++) {
			System.out.println("arr["+i+"]--->" +arr[i]);
		}
		
//		for(int i=0; i<length; i++) {
//			sum += arr[i];
//		}
//		System.out.println("The Sum is: "+sum);
		
		System.out.println("Sum: "+ArraySum(arr, length));
		
	}

}
