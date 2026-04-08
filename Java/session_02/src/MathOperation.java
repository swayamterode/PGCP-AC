import java.util.Scanner;

public class MathOperation {
	private double X;
	private double Y;
	private double R;

	public void init(int X, int Y) {
		this.X = X;
		this.Y = Y;
	}

	public void add() {
		R = X + Y;
	}

	public void multiply() {
		R = X * Y;
	}

	public void power() {
//		R = Math.pow(X, Y);
		double result = 1;
		for (int i = 1; i <= Y; i++) {
			result *= X ;
		}
		R = result;
	}

	public void display() {
		System.out.println("Result: " + R);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;

		System.out.println("Enter two numbers");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		MathOperation obj = new MathOperation();
		obj.init(num1, num2);
//		obj.add();
//		obj.multiply();
		obj.power();
		obj.display();

		sc.close();

	}
}
