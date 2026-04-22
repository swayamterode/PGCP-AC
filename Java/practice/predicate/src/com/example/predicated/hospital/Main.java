package com.example.predicated.hospital;

//Using a Predicate, identify all patients who are still admitted (not yet discharged)
//and are above the age of 60. Print their names.
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		Hospital patient1 = new Hospital("Rahul", 98, true);
		Hospital patient2 = new Hospital("Raj", 67, true);
		Hospital patient3 = new Hospital("Ravi", 97, true);
		Hospital patient4 = new Hospital("Rajhiv", 75, false);

		List<Hospital> li = Arrays.asList(patient1, patient2, patient3, patient4);

		Predicate<Hospital> checkPatient = (x -> x.getAge() > 60 && x.isAdmitted());

		li.stream().filter(checkPatient)
				.forEach(patient -> System.out.println(" Patient " + patient.getName() + " | Age: " + patient.getAge()));
	}
}
