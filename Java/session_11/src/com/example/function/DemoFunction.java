package com.example.function;

import java.util.function.Function;

public class DemoFunction {
	public static void main(String[] args) {
		// Create function for lower case and upper case
		Function<String, String> f = (a) -> a.toLowerCase() + " " + a.toUpperCase();
		System.out.println(f.apply("Swayam Terode"));

		// Input parameter as String, output as Integer
		Function<String, Integer> f2 = (s) -> s.length();
		System.out.println("Length of the string Swayam: " + f2.apply("Swayam"));
	}
}
