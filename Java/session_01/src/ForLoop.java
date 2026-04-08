import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int fact = 1;

		System.out.print("Enter the number: ");
		int n = s.nextInt();

		for (int i = 1; i <= n; i++) {
			fact *= i;
		}

		System.out.println("Factorial of number " + n + " is: " + fact);
		s.close();
	}
}
