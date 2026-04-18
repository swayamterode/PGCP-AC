package com.example.methodref.staticref;

import java.util.Arrays;
import java.util.List;

public class InstructorDetails {
	public static List<Instructor> getAll() {
		Instructor i1 = new Instructor("Swayam", "Male", 24, true, Arrays.asList("React"), 8);
		Instructor i2 = new Instructor("Raj", "Male", 54, false, Arrays.asList("Nextjs"), 10);
		Instructor i3 = new Instructor("Radha", "Female", 44, true, Arrays.asList("C++", "Java"), 12);
		Instructor i4 = new Instructor("Ravi", "Male", 63, true, Arrays.asList("Go"), 20);
		List<Instructor> list = Arrays.asList(i1, i2, i3, i4);
		return list;
	}
}
