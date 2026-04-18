package com.example.raf;

import java.io.*;

public class Demo {
	public static void main(String[] args) {
		RandomAccessFile raf1 = null;
		RandomAccessFile raf2 = null;

		try {
			File f1 = new File("/Users/swym/java/session_11/src/com/example/raf/input.txt");
			File f2 = new File("/Users/swym/java/session_11/src/com/example/raf/output.txt");
			
			if (!f1.exists()) {
				System.out.println("File not exists! ");
			} else {
				System.out.println("File exists!");
			}

			raf1 = new RandomAccessFile(f1, "r");
			raf2 = new RandomAccessFile(f2, "rw");

			System.out.println("Initial file pointer: " + raf1.getFilePointer());

			raf1.seek(14); // Move pointer to position 14
			System.out.println("After seek(10), pointer is at positon: " + raf1.getFilePointer());

			int startIndex=0;
			while ((startIndex = raf1.read()) != -1) {
				System.out.println(startIndex);
				raf2.write(startIndex);
			}

			System.out.println("Success: File copied from position 10");

		} catch (Exception e) {
			e.getMessage();
		} finally {
			try {
				if (raf1 != null)
					raf1.close();
			} catch (IOException e) {
				e.getMessage();
			}

			try {
				if (raf2 != null)
					raf2.close();
			} catch (IOException e) {
				e.getMessage();
			}
		}
	}
}