package com.example.methodref.instancemethod;

public class Employee {
    private int id;
    private String empName;
    private float salary;

    public Employee(int id, String empName, float salary) {
        this.id = id;
        this.empName = empName;
        this.setSalary(salary);
    }

    public int getId() {
        return id;
    }

    public String getEmpName() {
        return empName;
    }

    @Override
    public String toString() {
        return empName + " | id: [" + id + "]";
    }

	/**
	 * @return the salary
	 */
	public float getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(float salary) {
		this.salary = salary;
	}
}