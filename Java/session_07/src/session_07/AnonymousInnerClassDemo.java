package session_07;

public class AnonymousInnerClassDemo {
	public static void main(String[] args) {
		InterfaceArithmaticCal obj = new InterfaceArithmaticCal() {
			public void add(int a, int b) {
				System.out.println(a + b);
			}
		};
		obj.add(10, 34);
	}
}
