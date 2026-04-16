package session_08.classroom.seralization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test {
	public static void main(String[] args) throws IOException {
		SeralizationDemo emp = new SeralizationDemo("Swayam", 24);

		//		Try-with-resources
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
			oos.writeObject(emp);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
