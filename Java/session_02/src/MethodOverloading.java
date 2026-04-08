import java.util.Scanner;

public class MethodOverloading {
	public void add(int a, int b) {
		System.out.println("Addition of a+b = " + (a + b));
	}

	public void add(int a, float b) {
		float sum = a + b;
		System.out.println("(float) Sum of a+b= " + sum);
	}

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Numbers: ");

//		input from user
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		obj.add(num1, num2);

//		input for float add

		System.out.println("Enter two Numbers for float calculations: ");
		int num3 = sc.nextInt();
		float num4 = sc.nextFloat();
		obj.add(num3, num4);
		sc.close();
	}
}
