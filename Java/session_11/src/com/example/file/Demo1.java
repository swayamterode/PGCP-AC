// Notes:
// Input stream and output stream are byte oriented
// FileReader and FileWriter are char based
// File class will not create file
// End of file in Java is -1

package com.example.file;

import java.io.File;
import java.io.IOException;

public class Demo1 {
	File file;
	File file2; // yeh delete krne wala hu
	String path;

	public Demo1() throws IOException {
		file = new File("/Users/swym/java/session_11/src/com/example/file/data.txt");
		if (file.exists()) {
			System.out.println("File already present" + file.getCanonicalPath());
		} else {
			System.out.println(file.createNewFile());
		}

		if (file.canRead()) {
			System.out.println("Read Mode");
		}

		if (file.canWrite()) {
			System.out.println("Write Mode");
		}

		file2 = new File("/Users/swym/java/session_11/src/com/example/file/data2.txt");
		if (file2.exists()) {
//			System.out.println("File exists at: " + file2.getAbsoluteFile());
			System.out.println("File exists at: " + file2.getCanonicalPath());

			if (file2.delete()) {
				System.out.println("File deleted!");
			}
		}
		// file.delete(); // Check these methods
		System.out.println("file.getName(): " + file.getName());
		System.out.println("file.getParent(): " + file.getParent());
		System.out.println("file.getPath(): " + file.getPath());
		System.out.println("fiel.length(): " + file.length());
	}

	public static void main(String[] args) throws IOException {
		new Demo1();
	}
}
