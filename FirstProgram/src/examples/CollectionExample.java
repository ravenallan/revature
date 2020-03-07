package examples;

/* java.util.Collection (interface implemented by all collections) != java.util.Collections (Class w static methods used to manipulate collections)
 * 
 * Collections (Set, List, Queue) are mainly distinguished by 2 characteristics: how they order elements & whether those elements are sorted
 * 
 * Ordering determines where an element is in a collection; i.e. List stores elements w an index, like an array
 * A map assigns each element another obj that acts as a key, much like a dictionary uses a word key for its definition
 * 
 * Sets  : HashSet (unsorted), SortedSet, LinkedHashSet, NavigableSet, TreeSet (sorted)
 * Lists : ArrayList, Vector, LinkedList
 * Queue : PriorityQueue (typically FIFO)
 * 
 * Common Methods : .add(), .contains(), .remove(), .size() (returns # of elements)
 * 
 * Sets are good for unique elements, Lists may be better if this isn't required
 *
 * */

import java.util.ArrayList;

public class CollectionExample {
	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();
		
		arrList.add("Hello");
		arrList.add(" ");
		arrList.add("World");
		arrList.add(3, "!");
		
		System.out.println("Value at index 2: " + arrList.get(2));
		System.out.println(arrList);
	}
}
