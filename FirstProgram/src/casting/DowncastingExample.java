package casting;

public class DowncastingExample {
    public static void main(String[] args) {
        // Upcasting a `Dog` object to an `Animal` reference type
        Animal animalReference = new Dog();
        
        // Downcasting the `Dog` object referenced by `animalReference` into a Dog-typed reference variable
        // neither of these operations change the nature of the object itself; it always was, and always will be, a Dog!
        Dog dogReference = (Dog) animalReference;
        
        // Throws "ClassCastException" error
        Bird birdReference = (Bird) animalReference;
        
        // Use instanceof to check if the object pointed to by a reference variable has an is-a relationship to a particular class.
        if (animalReference instanceof Dog)
        	dogReference = (Dog) animalReference;
        else
        	System.out.println("animalReference does not point to a Dog object");
    }
}

class Animal {}

class Dog extends Animal {}

class Bird extends Animal {}
