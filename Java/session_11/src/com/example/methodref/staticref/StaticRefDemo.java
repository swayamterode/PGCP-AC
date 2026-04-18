package com.example.methodref.staticref;

import java.util.function.Predicate;
import java.util.List;

public class StaticRefDemo {
	public static boolean yrsofExperienceGtTen(Instructor instructor) {
		return instructor.getYear_of_experince() >= 10 ? true : false;
	}

	public static void main(String[] args) {
		List<Instructor> list = InstructorDetails.getAll();
		Predicate<Instructor> p = StaticRefDemo::yrsofExperienceGtTen;

		System.out.println("Instructors who have experience greater than 10 years!");
		list.forEach(instructor -> {
			if (p.test(instructor))
				System.out.println(instructor.getName() + " " + instructor.getYear_of_experince());
		});
	}
}