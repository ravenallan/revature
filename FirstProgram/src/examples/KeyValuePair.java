package examples;

/* We might want a method that accepts generic types inside a non-generic or concrete class.
 * In this case, you can declare the generic type in the method declaration, before the return type
 * 
 * Be aware, since you'll have no idea what the actual input types are, you're generally restricted
 * to only working with the methods in the Object class
 * 
 * To restrict types accepted by a generic class|method use the `extends` | `implements` keyword
 * 
 * */

public class KeyValuePair <K,V> {
	private K key;
	private V value;
	
	public void put(K newKey, V newValue) {
		key = newKey;
		value = newValue;
	}
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
}
