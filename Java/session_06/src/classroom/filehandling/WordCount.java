package classroom.filehandling;
import java.io.*;
import java.util.Scanner;

public class WordCount {
	public static void main(String[] args) throws FileNotFoundException {
		int totalWordCount = 0;

		try (Scanner sc = new Scanner(new File("brave.txt"))) {
			while (sc.hasNext()) {
				String words = sc.next();
				if (!words.equals(",")) {
				totalWordCount++;
				}
			}
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		} finally {
			System.out.println("Total Words: " + totalWordCount);
		}
	}
}
