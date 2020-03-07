package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("./person.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Person person = (Person) ois.readObject();
			
			System.out.println(person);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
