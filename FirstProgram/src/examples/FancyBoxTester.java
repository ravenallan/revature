package examples;

public class FancyBoxTester {
	public static void main(String[] args) {
		// This FancyBox container holds data as String elements
		FancyBox<String> myBox = new FancyBox<>();
		myBox.put("This string is in my FancyBox!");
		System.out.println(myBox.get());
		
		// This FancyBox container holds data as Integer elements
		FancyBox<Integer> newBox = new FancyBox<>();
		newBox.put(1);
		System.out.println(newBox.get());
	}
}
