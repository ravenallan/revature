package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) {
		Person person = new Person();
		
		person.setFirstName("John");
		person.setLastName("Smith");
		person.setEmail("john.smith@gmail.com");
		person.setSsn("13-45-6789");
		
		try {
			FileOutputStream fos = new FileOutputStream("./person.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(person);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
