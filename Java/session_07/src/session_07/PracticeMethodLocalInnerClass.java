package session_07;

import java.util.Scanner;

// task: access all the variables from the Outer and Inner class!
public class PracticeMethodLocalInnerClass {
	private int number;
	private String name;

	public PracticeMethodLocalInnerClass() {
		number = 109;
		name = null;
	}

	public PracticeMethodLocalInnerClass(String name, int number) {
		this.name = name;
		this.number = number;
	}

	public class InnerClass {
		private int number;
		private String name;

		public InnerClass() {
			number = 103;
			name = "Maxi";
		}

		public void getData() {
			System.out.println("Inside Inner Class Number var value: " + number);
			System.out.println("Outer class number var value: " + PracticeMethodLocalInnerClass.this.number);
			System.out.println("\n\nInside Inner Class name var value: " + name);
			System.out.println("Outer class name var value: " + PracticeMethodLocalInnerClass.this.name);

		}
	}

	public static void main(String[] args) {
		String name;
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		name = sc.next();
		System.out.print("Enter number: ");
		number = sc.nextInt();

//		PracticeMethodLocalInnerClass outerObj = new PracticeMethodLocalInnerClass(name, number); // created obj of outer class means number is intailzed!
		InnerClass obj = new PracticeMethodLocalInnerClass(name, number).new InnerClass();
		obj.getData();

		sc.close();
	}

}
