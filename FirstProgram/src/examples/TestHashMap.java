package examples;

/* The Map interface is not a part of the Collection hierarchy but it's still referred to as a collection / data structure
 * 
 * Maps store data in key-value pairs, e.g. Hashtable, HashMap, TreeMap implementations
 * 
 * Hashtable & HashMap store objs based on a special identifier called a hash code, generated for an obj using a special hashing f(n)
 * both are used to sort & retrieve objs efficiently
 * 
 * Hashtable
 * 		- synchronized (apps using multiple concurrent processes|threads access Hashtable safely by 2 different processes simultaneously)
 * 		- doesn't allow null keys|values
 * 
 * HashMap
 * 		- NOT synchronized, but faster; preferred in apps w only 1 process req access at a time
 * 		- allows up to 1 null key, any value can be null
 * 
 * TreeMap
 * 		- sorted elements
 * 		- methods include: .put(), .get(), .keySet() (returns List of all keys in the map, typically used for iteration)
 *
 * Due to their efficiency Maps are one of, if not the most commonly used type of collection; can access contents in O(1) time, right behind Lists
 * 
 * 
 * */

import java.util.HashMap;

public class TestHashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> myMap = new HashMap();
		
		myMap.put(1,  "James");
		myMap.put(2,  "Mike");
		myMap.put(3,  "Mary");
		
		System.out.println("The String stored under the key \"3\" is:  " + myMap.get(3));
	}
}
