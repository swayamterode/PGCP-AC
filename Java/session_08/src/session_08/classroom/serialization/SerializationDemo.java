package session_08.classroom.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) throws IOException {
		SerializationInterface emp = new SerializationInterface("Swayam", 24);

		//		Try-with-resources
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
			oos.writeObject(emp);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
