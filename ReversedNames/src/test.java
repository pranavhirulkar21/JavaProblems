import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first Friend's name: ");
		String friend1 = sc.nextLine();

		System.out.print("Enter second Friend's name: ");
		String friend2 = sc.nextLine();
		
		System.out.print("Enter third Friend's name: ");
		String friend3 = sc.nextLine();
		
		sc.close();
		printFriendsName(friend1, friend2, friend3);
		
	}
	
	static void printFriendsName(String friend1, String friend2, String friend3) {
		String[] reverseFriends = {friend3, friend2, friend1};
		String outputString = String.join(", ", reverseFriends[0], reverseFriends[1])+" and "+ reverseFriends[2];
		System.out.println("Hi "+outputString);
	}

}


