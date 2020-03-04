package examples;

// this class modifies our existing `Animal` class (InheritanceExample.java) to be Abstract (meaning it can only be inherited)

abstract class Animal {
	public void eat() {
		System.out.println("The animal munches on some food");
	}
	
	abstract void move();
}

class Dog extends Animal {
	public void move() {
		System.out.println("The Dog walks around");
	}
	
	public void beg() {
		System.out.println("The dog looks cute to get food");
	}
}

public class AbstractExample {
	public static void main(String[] args) {
		Dog myDog = new Dog();
		
		myDog.eat();
		myDog.move();
		myDog.beg();
	}
}
