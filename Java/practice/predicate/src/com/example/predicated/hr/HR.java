package com.example.predicated.hr;

public class HR {
//	 An HR system stores employee records. Each employee has a name, 
//	department, and a boolean flag indicating if they are currently active.
	private String name;
	private String deptName;
	private boolean isActive;

	public HR() {
	}

	public HR(String name, String deptName, boolean isActive) {
		this.name = name;
		this.deptName = deptName;
		this.isActive = isActive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "HR [name=" + name + ", deptName=" + deptName + ", isActive=" + isActive + "]";
	}

}
