package session_10.comparable.treeset;

public class EmployeeComparable extends Employee implements Comparable<EmployeeComparable> {

	public EmployeeComparable(int empId, String empname, double empSalary) {
		super(empId, empname, empSalary);
	}

	/**
	 *Sort in desc order!
	 */
	@Override
	public int compareTo(EmployeeComparable e) {
		if (this.getEmpId() > e.getEmpId()) {
			return -1;
		} else if (this.getEmpId() < e.getEmpId()) {
			return +1;
		} else
			return 0;
	}

}
