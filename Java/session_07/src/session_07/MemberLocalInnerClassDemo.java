package session_07;

public class MemberLocalInnerClassDemo {
	private int num;

	public MemberLocalInnerClassDemo() {
		num = 10;
	}

	public void get() {
		int num = 110;
//		Member Local Inner class!
		class Inner {
			int num;

			public Inner() {
				num = 90;
			}

			public int getNumber() {
				return num;
			}
		}
		Inner obj = new Inner();
		System.out.println("n: " + obj.getNumber());
	}

	public static void main(String[] args) {
		MemberLocalInnerClassDemo obj = new MemberLocalInnerClassDemo();
		obj.get();
	}
}
