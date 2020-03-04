package examples;

// 3 keywords discussed: `static`, `final` (makes immutable), `abstract`

class StaticDemo {
	static int counter = 0;
	int number = 0;
	
	public StaticDemo() {
		counter++;
		number++;
	}
}

public class StaticExample {
	public static void main(String[] args) {
		// instantiate instanceA variable by calling constructor
		StaticDemo instanceA = new StaticDemo();
		System.out.println("instanceA counter:" + instanceA.counter);
		System.out.println("instanceA number:" + instanceA.number);
		
		// instantiate instanceB variable by calling constructor
		StaticDemo instanceB = new StaticDemo();
		System.out.println("instanceB counter:" + instanceB.counter);
		System.out.println("instanceB number:" + instanceB.number);
		
		// everytime the constructor is called it increments both counters
		// but running the code above returns curious result
		// 
		// instanceA counter:1
		// instanceA number:1
		// instanceB counter:2
		// instanceB number:1
		
		// this is because `number` is a local static instance and `counter` is a global var
		// which is counting the number of instances that were created
	}
}
