package examples;

/* Generics are enforced w the angle (<>) brackets. Are used to enforce (compile-time) type safety
 * without generics, collections can hold any type of object, meaning contents have to be type-checked and cast when retrieved
 * 
 * When instantiating a collection you have to provide the specified type(s)
 * 
 * When writing Classes generic types are typically expressed using a single letter
 * 
 * "E" when type is an element of a collection
 * "K" | "V" when type is a map key|value
 * "N" for number
 * "T","S","U" for generic type, generic purpose
 * 
 * */

// Container for any obj of a single type, designated as "T"
public class FancyBox <T> {
	
	private T contents;
	
	public FancyBox() {}
	
	public FancyBox(T in) {
		this.contents = in;
	}
	
	public void put(T in) {
		this.contents = in;
	}
	
	public T get() {
		return contents;
	}
}
