package p1;

public class A {
	protected int no; // access modifier as protected

	public A() {
		no = 10;
	}

	public int getNumber() {
		return no;
	}

	public static void main(String[] args) {
		A obj = new A();
		System.out.println(obj.getNumber());
	}

}
