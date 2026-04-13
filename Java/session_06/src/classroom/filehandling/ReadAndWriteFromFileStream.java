package classroom.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteFromFileStream {
	public static void main(String[] args) throws IOException {
		try (FileOutputStream fos = new FileOutputStream("test.txt", true); // true means it will append the file!
				FileInputStream fis = new FileInputStream("brave.txt")) {
			int startIndex = 0;
			while ((startIndex = fis.read()) != -1) { // reads until it reaches end of the file!
				System.out.print((char) startIndex);
				fos.write(startIndex);
			}

		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
