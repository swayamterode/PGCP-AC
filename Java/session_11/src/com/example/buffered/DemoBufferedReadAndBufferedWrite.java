package com.example.buffered;

import java.io.*;

public class DemoBufferedReadAndBufferedWrite {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String str = null;

		try (BufferedReader br = new BufferedReader(
				new FileReader("/Users/swym/java/session_11/src/com/example/buffered/input.txt"));
				BufferedWriter bw = new BufferedWriter(
						new FileWriter("/Users/swym/java/session_11/src/com/example/buffered/output.txt"))) {

			while ((str = br.readLine()) != null) {
				System.out.println(str);
				bw.write(str); // this will write the content in file
			}
			bw.newLine();

		}
	}
}
