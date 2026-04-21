package session_12.com.example.javaapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		Employee e1 = new Employee(11, "Sagar", 46000);
		Employee e2 = new Employee(22, "Swayam", 52000);
		Employee e3 = new Employee(33, "Sid", 78000);
		Employee e4 = new Employee(44, "Sita", 25000);
		Employee e5 = new Employee(55, "Ram", 50000);
		List<Employee> li = Arrays.asList(e1, e2, e3, e4, e5);
		System.out.println(li);

		// count -> returns count
		long count = li.stream().count();
		System.out.println("Count: " + count);
		// collect (), filter()
		System.out.println("----");
		List<Employee> l1 = li.stream().filter(t -> t.getEmpSal() > 50000).collect(Collectors.toList());
		System.out.println(l1);
		System.out.println("----");
		li.stream().filter(i -> i.getEmpSal() > 50000).collect(Collectors.toList()).forEach(System.out::println);

		Set<String> s = li.stream().map(Employee::getEmpName).collect(Collectors.toSet());
		s.forEach(System.out::println);

		li.stream().sorted(Comparator.comparing(Employee::getEmpSal)
//				.reversed() // this will reverse the order!
		).forEach(System.out::println); // member reference
		s.stream().sorted().forEach(System.out::println);

//		Optional keyword - A container object which may or may not contain a non-null value. If a value is present, isPresent() returns true. 
//		If no value is present, the object is considered empty and isPresent() returns false.

		Optional<Employee> o = li.stream().min(Comparator.comparing(Employee::getEmpSal));
		System.out.println(o.get());
		long salSum = li.stream().map(Employee::getEmpSal).reduce(0L, Long::sum);
		System.out.println("Salary Sum: " + String.format("%,d", salSum));

	}
}
