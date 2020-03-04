package polymorphism;

public class Dog extends Animal {
    // String name;		// inherited property
	//
	// the property `name` is declared in parent `Animal` class
	// if undefined here, `Dog` will inherit its parent value
	// if defined, it will redefine/override it accordingly

	String breed;
	
	public boolean hasFur = true;
    
	// since Animal.eat() already exists, Dog.eat() method overrides its functionality
    public void eat() {
        System.out.println("I eat kibble");
    }
    
    public void bark() {
        System.out.println("Woof!");
    }
}
