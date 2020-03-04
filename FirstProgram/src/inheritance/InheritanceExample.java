package inheritance;

public class InheritanceExample {
	public static void makeItTalk(Animal a) {
		a.speak();
		
		if (a instanceof Dog)
			((Dog) a).beg();
	}
	
	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		Dog myDog = new Dog();
		
		System.out.println("Make the Animal object speak:");
		makeItTalk(myAnimal);
		
		System.out.println("Make the Dog object speak:");
		makeItTalk(myDog);
	}
}

class Animal {
	public void speak() {
		System.out.println("Generic animal noise!");
	}
	
	public void beg() {
		System.out.println("The dog looks cute for food.");
	}
}

class Dog extends Animal {
	// example of method overriding; called in makeItTalk();
	public void speak() {
		System.out.println("Woof!");
	}
}
