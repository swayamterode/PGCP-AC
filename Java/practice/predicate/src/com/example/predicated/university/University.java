package com.example.predicated.university;

public class University {
	private String name;
	private double GPA;
	private int creditsHoursCompleted;
	private boolean isProbation;

	public University() {
	}

	public University(String name, double gPA, int creditsHoursCompleted, boolean isProbation) {
		this.name = name;
		GPA = gPA;
		this.creditsHoursCompleted = creditsHoursCompleted;
		this.isProbation = isProbation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	public int getCreditsHoursCompleted() {
		return creditsHoursCompleted;
	}

	public void setCreditsHoursCompleted(int creditsHoursCompleted) {
		this.creditsHoursCompleted = creditsHoursCompleted;
	}

	public boolean isProbation() {
		return isProbation;
	}

	public void setProbation(boolean isProbation) {
		this.isProbation = isProbation;
	}

	@Override
	public String toString() {
		return "University [name=" + name + ", GPA=" + GPA + ", creditsHoursCompleted=" + creditsHoursCompleted
				+ ", isProbation=" + isProbation + "]";
	}

}
