import java.util.Scanner;

public class UsingContinue {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a max number to print odd series:");
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0)
				continue;
			else
				System.out.println(i);
		}

		s.close();
	}
}
