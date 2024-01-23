
class Animal{
	void makeSound() {
		System.out.println("SOUND SOUND SOUND");
	}
}

class Dog extends Animal{
	@Override
	void makeSound() {
		System.out.println("WOOF! WOOF!");
	}
}

class Cat extends Animal{
	@Override
	void makeSound() {
		System.out.println("MEOW! MEOW!");
	}
}


public class runTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal = new Animal();
		animal.makeSound();
		
		Dog dog = new Dog();
		dog.makeSound();
		
		Cat cat = new Cat();
		cat.makeSound();
		
		Animal a = new Dog();
		a.makeSound();
		Animal b = new Cat();
		b.makeSound();
		
//		Dog d = (Dog) new Animal();
//		d.makeSound();			ClassCastException
		
	}

}
