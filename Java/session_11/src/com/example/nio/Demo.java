package com.example.nio;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Demo {
	public static void main(String[] args) throws IOException {
		List<String> lines = Files.readAllLines(Paths.get("/Users/swym/java/session_11/src/com/example/nio/input.txt"));
		
		for (String line : lines) {
			System.out.println(line);
			Path p = Files.write(Paths.get("/Users/swym/java/session_11/src/com/example/nio/output.txt"),
					Arrays.asList(line));
			System.out.println(p);
		}

//		Path p = Files.write(Paths.get("/Users/swym/java/session_11/src/com/example/nio/output.txt"),
//				Arrays.asList("List1", "List2", "List3", "List4"));

//		System.out.println(p); /// Users/swym/java/session_11/src/com/example/nio/output.txt

//		Path input = Paths.get("/Users/swym/java/session_11/src/com/example/nio/input.txt");
//		Path output = Paths.get("/Users/swym/java/session_11/src/com/example/nio/output.txt");
//
//		List<String> lines = Files.readAllLines(input);
//		Files.write(output, lines);

		System.out.println("Success");
	}
}
