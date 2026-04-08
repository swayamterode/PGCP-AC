import java.util.Scanner;

public class CheckNumberIsOddOrEven {
	public static void main (String [] args) {
		Scanner s = new Scanner(System.in);
		
		int num1 = s.nextInt();
		if(num1%2 ==0) System.out.println(num1+" is Even Number!");
		else System.out.println(num1+ " is Odd Number");
		s.close();
	}
}
