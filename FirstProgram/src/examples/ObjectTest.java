package examples;

/*
 * Object class methods
 * 
 * toString() 			// prints memory address of obj
 * hashCode() 			// used to provide uniqueID for obj
 * equals(Object o)		// compare 2 objs; by default compares mem addrs; functionally equivalent to == unless overridden
 * finalize() 			// method called by garbage collector for any obj instance before removed from memory
 * clone() 				// create copy of obj
 */

class Person {
	private String name;
	
	// Person getter & setter
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public String toString() {
		return "Hi, I'm " + this.name;
	}
}

public class ObjectTest {
	public static String print(Object o) {
		return o.toString();
	}
	
	public static void main(String[] args) {
		Person someone = new Person();
		
		someone.setName("Joe");
		
		// initially displays in console: "examples.Person@448139f0"
		// upon overriding method declaring our own Person.toString() method it displays in console: "Hi, I'm Joe"
		System.out.println(print(someone));
	}
}
