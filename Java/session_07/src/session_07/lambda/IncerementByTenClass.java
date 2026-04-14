package session_07.lambda;

import java.util.Scanner;

public class IncerementByTenClass {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number you want to increment by 10: ");
		int num = sc.nextInt();
		IncrementByTenInterface obj = (a) -> {
			return a + 10;
		};

		System.out.println("Incremented Value: " + obj.incrementByTen(num));

		sc.close();
	}

}
