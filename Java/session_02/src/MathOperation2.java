public class MathOperation2 {
	public void multiply(int num1, int num2) {
		System.out.println("Multiplication of numbers: " + num1 * num2);
	}

	public void multiply(float num1, float num2, float num3) {
		System.out.println("Multiplication of numbers: " + (num1 * num2 * num3));
	}

	public void multiply(int... arr) {
		int product = 1;
		for (int num : arr) {
			product *= num;
		}
		System.out.println("Multiplication of numbers: " + product);
	}

	public void multiply(double num1, int num2) {
		System.out.println("Multiplication of numbers: " + num1 * num2);
	}

	public static void main(String[] args) {
		MathOperation2 obj = new MathOperation2();
		obj.multiply(1, 2, 3, 4, 5);
		obj.multiply(2.1f, 2.1f, 3.1f);
		obj.multiply(3.145, 2);
	}
}
