import java.util.Scanner;

public class MaxOfThreeNumbers {
	 public static void main(String[] args) {
		 System.out.println("Enter three numbers: ");
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int num3 = s.nextInt();
		
		  int result = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
		  System.out.println(result);
		
		s.close();
	}
}
