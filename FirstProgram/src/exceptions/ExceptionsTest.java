package exceptions;

// Checked (detected during compilation) & Unchecked (occur during runtime)
/*
 * 		Throwable
 * 	     /      \
 * 	  Error     Exception
 * 			  /      |       \
 * 	       IO  ClassNotFound Runtime
 * 								|
 * 							/	|	\
 * 			   Arithmetic  ClassCast  IndexOutOfBounds
 * */

public class ExceptionsTest {
	public static void main(String[] args) {
		// `try` black must have at least 1 catch|finally block
		try {
			System.out.println("1 / 0 = " + (1 / 0));
		} catch (ArithmeticException e) {
			System.out.println("Caught an arithmetic exception!");
			// print the stack trace programmatically
			e.printStackTrace();
		} finally {
			System.out.println("This is the optional \"finally\" block.");
		}
		
		System.out.println("The code has continued on, as normal");
	}
}
