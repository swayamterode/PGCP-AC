package com.example.methodref.staticref;

import java.util.List;

public class Instructor {
	private String name;
	private String gender;
	private int age;
	private boolean onlineCourse;
	private List<String> courses;
	private int year_of_experince;

	public Instructor(String name, String gender, int age, boolean onlineCourse, List<String> courses,
			int year_of_experince) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.onlineCourse = onlineCourse;
		this.courses = courses;
		this.year_of_experince = year_of_experince;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isOnlineCourse() {
		return onlineCourse;
	}

	public void setOnlineCourse(boolean onlineCourse) {
		this.onlineCourse = onlineCourse;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public int getYear_of_experince() {
		return year_of_experince;
	}

	public void setYear_of_experince(int year_of_experince) {
		this.year_of_experince = year_of_experince;
	}

	@Override
	public String toString() {
		return "Instructor [name=" + name + ", gender=" + gender + ", age=" + age + ", onlineCourse=" + onlineCourse
				+ ", courses=" + courses + ", year_of_experince=" + year_of_experince + "]";
	}

}
