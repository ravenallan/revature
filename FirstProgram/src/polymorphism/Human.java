package polymorphism;

public class Human extends Animal {
	int legs = 2;	// overridden
	
	public void eat() {
		System.out.println("I eat whatever I want");
	}
}
