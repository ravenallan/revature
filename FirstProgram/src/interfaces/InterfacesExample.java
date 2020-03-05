package interfaces;

// Java Interfaces are used to guarantee the availability of methods in implementing classes

// All methods are "public abstract" and all variables are "public static final"
// Interfaces make compiler-enforced contracts; a class that implements an interface must provide
// an implementation for every interface method, or be an abstract class

// A class can only extend one other concrete|abstract class, but it can implement multiple interfaces

// `default` keyword introduced to combat issue of developers pushing new updates to Interfaces
// where devs were required to either avoid updating and use old library versions, or write their own
// implementation of (newly-added) methods introduced in update. enter default implementations

public class InterfacesExample {
	public static void main(String[] args) {
		Animal domesticatedThing = new Dog();
		domesticatedThing.eat();
		
		// using polymorphism refers to Dog object using Domesticated type reference var domesticatedThing
		Domesticated myPet = new Dog();
		myPet.doWork();
	}
}

interface Domesticated {
	public void doWork();
}

class Animal {
	public void eat() {
		System.out.println("I eat food");
	}
}

class Wolf extends Animal {
	public void eat() {
		System.out.println("I eat fresh meat");
	}
}

class Dog extends Animal implements Domesticated {
	public void eat() {
		System.out.println("I eat kibble");
	}
	
	public void doWork() {
		System.out.println("I perform a trick!");
	}
}
