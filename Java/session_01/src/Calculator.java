import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch, ans;
		int num1, num2, result = 0;

		do {
			System.out.println("a.Addtion\tb.Sub\tc.Mul\td.Div\te.exit");

			System.out.print("Enter yout choice: ");
			ch = sc.next().charAt(0);
			System.out.println("Enter two numbers:");
			num1 = sc.nextInt();
			num2 = sc.nextInt();

			switch (ch) {
			case 'a': {
				result = num1 + num2;
				System.out.println("The result of additon is: " + result);
				break;
			}
			case 'b': {
				result = num1 - num2;
				System.out.println("The result of subtraction is: " + result);
				break;
			}
			case 'c': {
				result = num1 * num2;
				System.out.println("The result of multiplication is: " + result);
				break;
			}
			case 'd': {
				if (num2 == 0) {
					System.out.println("Denominator cannot be 0!!!");
				}
				result = num1 / num2;
				System.out.println("The result division is : " + result);
				break;
			}
			case 'e': {
				System.exit(0);
			}
			default:
				System.out.println("WRONG CHOICE");
			}

			System.out.println("Do you want to continue (Y/N)? ");
			ans = sc.next().charAt(0);
		} while (ans == 'N');
		sc.close();
	}
}
