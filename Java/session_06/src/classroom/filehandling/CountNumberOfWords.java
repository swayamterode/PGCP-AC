//this apporach is wrong! this was my first written code!
package classroom.filehandling;

import java.io.*;

public class CountNumberOfWords {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		int startIndex = 0;
		int totalWordCount = 0;
		try {
			fis = new FileInputStream("brave.txt");
			while ((startIndex = fis.read()) != -1) {
				if (startIndex == ' ') {
					totalWordCount++;
				}
			}
			totalWordCount++; // last word count nahi ho raha tha to isse se ho gaya hai it only count spaces.
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		} finally {
			System.out.println("Total word count: " + totalWordCount);
			fis.close();

		}

		System.out.println("Total word count: " + totalWordCount);
	}
}
