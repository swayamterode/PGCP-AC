package com.example.predicated.hospital;
//Scenario: A hospital stores patient records. 

//Each record contains the patient's name, age, and whether they have been discharged.
//Task: Using a Predicate, identify all patients who are still admitted (not yet discharged) 
//and are above the age of 60. Print their names.

public class Hospital {
	private String name;
	private int age;
	private boolean isAdmitted;

	public Hospital() {
	}

	public Hospital(String name, int age, boolean isAdmitted) {
		super();
		this.name = name;
		this.age = age;
		this.isAdmitted = isAdmitted;
	}

	public boolean isAdmitted() {
		return isAdmitted;
	}

	public void setAdmitted(boolean isAdmitted) {
		this.isAdmitted = isAdmitted;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Hospital [name=" + name + ", age=" + age + ", isAdmitted=" + isAdmitted + "]";
	}

}
