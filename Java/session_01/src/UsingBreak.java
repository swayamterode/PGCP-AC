import java.util.Scanner;

public class UsingBreak {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = s.nextInt();

		for (int i = 1; i <= num; i++) {
			if(i%2 == 0) break;
			System.out.println(i);
		}

		s.close();
	}
}
