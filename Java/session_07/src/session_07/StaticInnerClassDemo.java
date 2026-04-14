package session_07;

//Static inner class has no link to any outer class instance —
//so it can only see static members of the outer class.
//And static members must be initialized without relying on a constructor.
public class StaticInnerClassDemo {
	private int num1;
	private static int num2;

	public StaticInnerClassDemo() {
		num1 = 10;
	}

	static {
		num2 = 434;
	}

	public static class Inner {
		private int number = 100;

		public void get() {
//			System.out.println(num1); // Cannot make a static reference to the non-static field num1
			System.out.println("Num2 is static varirable and has value: " + num2);
			System.out.println("Number is inside inner class: " + number);
		}
	}

	public static void main(String[] args) {
		StaticInnerClassDemo.Inner obj = new StaticInnerClassDemo.Inner();
		obj.get();
	}
}
