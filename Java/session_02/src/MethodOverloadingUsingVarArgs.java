public class MethodOverloadingUsingVarArgs {
	public int add(int... a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	public double add(double... a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		MethodOverloadingUsingVarArgs obj = new MethodOverloadingUsingVarArgs();
		int result1 = obj.add(1, 34, 51, 5, 2, 42, 2, 13, 4, 3, 34, 5, 3, 434, 34, 34, 3);
		double result2 = obj.add(1.232, 123.422, 23.232, 232.234, 123.00);
		System.out.println(result1);
		System.out.println(result2);
	}
}
