package session_10.comparable.treeset;

import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		EmployeeComparable e1 = new EmployeeComparable(22, "Swayam", 33434.78f);
		EmployeeComparable e2 = new EmployeeComparable(11, "Ram", 2344.78f);
		EmployeeComparable e3 = new EmployeeComparable(33, "Abhi", 42235.78f);
		EmployeeComparable e4 = new EmployeeComparable(44, "Jay", 86634.78f);
		
		TreeSet<EmployeeComparable> t = new TreeSet<EmployeeComparable>();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		
		System.out.println(t);
	}
}
