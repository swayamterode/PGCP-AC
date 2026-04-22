package com.example.predicated.hr;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//Using a Predicate, find all employees who belong to the 'Finance' department and are active. Print their names.
public class Main {
	public static void main(String[] args) {
		HR hr1 = new HR("Swayam", "Finance", true);
		HR hr2 = new HR("Radha", "IT", true);
		HR hr3 = new HR("JOHN", "Finance", false);
		HR hr4 = new HR("Rabi", "Finance", true);
		List<HR> li = Arrays.asList(hr1, hr2, hr3, hr4);
		System.out.println(li.toString());
		Predicate<HR> isFinanceDeptAndActive = (x) -> x.getDeptName() == "Finance" && x.isActive();

		li.stream().filter(isFinanceDeptAndActive).forEach(x -> System.out
				.println(x.getName() + " | Dept Name: " + x.getDeptName() + " , is active: " + x.isActive()));
	}
}
