
/*
  // OVERRIDING
 
	class Animal{
		public void makeSound() {
			System.out.println("I am an Animal!");
		}
	}
	class Dog extends Animal{
		@Override
		public void makeSound() {
			System.out.println("Woof!");
		}
	}
	
public class main {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.makeSound();
		
		Dog b = new Dog();
		b.makeSound();
		
		Animal c = new Dog();
		c.makeSound();
	}
}
*/

//OVERLOADING

class Math {
	public int add(int a, int b) {
		return a + b;
	}

	public double add(double a, double b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}
}

public class main {
	public static void main(String[] args) {
		Math a = new Math();
		int n = a.add(1, 2, 3);
		System.out.println(n);

		Math b = new Math();
		double m = b.add(1.0, 2.2);
		System.out.println(m);
	}
}
