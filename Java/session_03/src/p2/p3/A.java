//package p2.p3;
//import p1.A;
//
//public class A  extends A{
//	public static void main(String[] args) {
//		p1.A obj = new p1.A();
//	}
//}

// The above code is not working because we didn't use fully qualified name

package p2.p3;

public class A  extends p1.A{
	public static void main(String[] args) {
		p1.A obj = new p1.A();
		System.out.println(obj.getNumber());
	}
}