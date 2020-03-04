package casting;

import java.util.List;

// Let’s say you’re programming a video game, where you have a lot of monsters roaming around the world.

// You need to make sure that every couple of seconds, every monster moves to a new random location,
// but you have a lot of different types of monster classes, each with their own logic.

// By applying our knowledge of polymorphism, we can make each monster class inherit from a shared superclass, Creature, which declares a method called “roam()”.
// Every monster class might have unique logic for the roam() method, but they are guaranteed to at least possess a roam() method.

// In our game logic now, we can store all of our individual monster classes in a collection of Creature type reference variables,
// and iterate over each Creature reference type to call the roam() method on each.

// Now these few lines of code can handle the roaming behavior for 10 monsters or 10,000, even if each monster is a unique class with unique behavior.
// This is the power of polymorphism.

public class VideoGameExample {
	public static void main(String[] args) {
		// figure out how to store & interate Creature (List<Creature>) data...
	}
	
	public void roaming(List<Creature> cList) {
		for (Creature c: cList)
			c.roam();
	}
}
