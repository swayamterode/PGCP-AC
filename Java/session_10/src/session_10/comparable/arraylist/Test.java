package session_10.comparable.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	public static void main(String[] args) {
		Employee e1 = new Employee(22, "Swayam", 33434.78f);
		Employee e2 = new Employee(11, "Ram", 2344.78f);
		Employee e3 = new Employee(33, "Abhi", 42235.78f);
		Employee e4 = new Employee(44, "Jay", 86634.78f);

//		TreeSet<Employee> t = new TreeSet<Employee>();
		ArrayList<Employee> t = new ArrayList<Employee>();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		Collections.sort(t, new MyComparator());
		System.out.println(t);
	}
}
