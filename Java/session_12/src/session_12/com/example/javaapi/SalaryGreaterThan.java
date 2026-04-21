package session_12.com.example.javaapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SalaryGreaterThan {

	public static void main(String[] args) {
		Employee e1 = new Employee(11, "Sagar", 46000);
		Employee e2 = new Employee(22, "Swayam", 52000);
		Employee e3 = new Employee(33, "Sid", 78000);
		Employee e4 = new Employee(44, "Sita", 25000);
		Employee e5 = new Employee(55, "Ram", 50000);
		List<Employee> list = Arrays.asList(e1, e2, e3, e4, e5);

		Map<String, Long> mp = list.stream().filter(sal -> sal.getEmpSal() > 50000)
				.collect(Collectors.toMap(Employee::getEmpName, Employee::getEmpSal));

		System.out.println(mp);
	}
}
