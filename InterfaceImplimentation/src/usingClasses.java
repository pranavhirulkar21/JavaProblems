
class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void makeSound() {
		System.out.println("Sound Sound Sound");
	}
}

class Dog extends Animal {
	private String breed;

	public Dog(String name, String breed) {
		super(name);
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	@Override
	public void makeSound() {
		System.out.println("Woof! Woof!");
	}
}

public class usingClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal("JustAnAnimal");
		System.out.println("Name of the Animal: " + animal.getName());
		animal.makeSound();

		System.out.println(".............");

		Dog myDog = new Dog("Tommy", "Labrador");
		System.out.println("Name of the Dog: " + myDog.getName());
		System.out.println("Breed of the Dog: " + myDog.getBreed());
		myDog.makeSound();

	}

}
