package classroom.filehandling;

import java.io.*;

public class CountNoOfA {
	public static void main(String[] args) throws IOException {
		int startIdx = 0;
		int countOfA = 0;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("brave.txt");
			while ((startIdx = fis.read()) != -1) {
				if (startIdx == 'A' || startIdx == 'a')
					countOfA++;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			fis.close();
			System.out.println("Count of A: " + countOfA);
		}

	}
}
