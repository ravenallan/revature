package polymorphism;

public class PolymorphismExample {
    public static void main(String[] args) {
    	Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        
        myDog.eat();
        
        // cannot invoke `Dog` bark() method bc `Animal` ref type doesnt grant access to undefined (Animal) methods
        // myDog.bark();
        
        System.out.println(myDog.hasFur);
        
        // test how `name` property value behaves when inherited vs. overwritten
        // System.out.println("My name is: " + myDog.name);
    }
}
