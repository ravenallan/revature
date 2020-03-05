package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionExample {
	public static void openFile() throws FileNotFoundException {
		// deliberately attempt to open nonexistent file in order to throw error
		new FileInputStream("C:\\DoesNotExist.txt");
	}
	
	public static void main(String[] args) {
		try {
			openFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
