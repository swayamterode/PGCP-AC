import java.util.Scanner;

public class CheckGraterOfTwoNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
//		this is the basic if else condition
//		if(num1>num2)
//			System.out.println(num1+ " is greater");
//		else
//			System.out.println(num1+ " is greater");
		int result =(num1>num2)?num1:num2;
		System.out.println("The Greatest of two number " + num1 + ", "  + num2 +" is: " + result);
		s.close();
	}
}
