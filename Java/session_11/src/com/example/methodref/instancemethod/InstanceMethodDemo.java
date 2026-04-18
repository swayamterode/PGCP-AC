package com.example.methodref.instancemethod;

import java.util.Comparator;
import java.util.TreeSet;

// Instance Method Reference Demo
public class InstanceMethodDemo {
	public static void main(String[] args) {

		// Comparator using method reference + chaining
		Comparator<Employee> c = Comparator.comparing(Employee::getEmpName).thenComparing(Employee::getId);

		TreeSet<Employee> t = new TreeSet<Employee>(c);

		t.add(new Employee(22, "Swayam", 33434.78f));
		t.add(new Employee(11, "Ram", 2344.78f));
		t.add(new Employee(33, "Abhi", 42235.78f));
		t.add(new Employee(44, "Jay", 86634.78f));
		t.add(new Employee(55, "Jay", 86634.78f));

		System.out.println(t);
	}
}