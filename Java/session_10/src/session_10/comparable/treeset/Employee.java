package session_10.comparable.treeset;

/**
 * @author Swayam
 * This is the class of employee
 */
public class Employee {
	private int empId;
	private String empname;
	private double empSalary;

	public Employee(int empId, String empname, double empSalary) {
		super();
		this.empId = empId;
		this.empname = empname;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empname=" + empname + ", empSalary=" + empSalary + "]";
	}
}
