package session_08.classroom.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"))) {
			SerializationInterface emp = (SerializationInterface) ois.readObject();
			System.out.println(emp);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
