package classroom.assertion;

import java.util.Scanner;

public class AssertDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = 0;
		System.out.print("Enter your age: ");
		age = sc.nextInt();
		assert age > 18 : "You cant vote!";
		System.out.println("Welcome, User of age " + age + " can vote!");
		sc.close();
	}
}
