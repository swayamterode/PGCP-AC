package com.example.predicated.university;

//A student qualifies if: GPA is 3.7 or above AND credit hours completed exceed 60 AND they are NOT on academic probation. Print the qualifying students' names.

import java.util.List;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		University s1 = new University("Swayam", 3.8, 72, false);
		University s2 = new University("Ram", 4.1, 72, true);
		University s3 = new University("Shyam", 3.2, 72, false);
		University s4 = new University("Ravi", 3.1, 72, false);
		University s5 = new University("Raghu", 3.9, 72, true);

		List<University> li = List.of(s1, s2, s3, s4, s5);
		System.out.println(li);

		Predicate<University> isGPAQualified = (x) -> {
			return false;
		};
		Predicate<University> isCreditExceedAndNotInProbation = (x) -> {
			return x.getCreditsHoursCompleted() > 60 && x.isProbation();
		};
		Predicate<University> isQualified = isGPAQualified.or(isCreditExceedAndNotInProbation);
		li.stream().filter(isQualified).forEach(s -> System.out.println(s.getName()));
	}
}
