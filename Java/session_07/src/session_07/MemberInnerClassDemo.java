package session_07;

// treat this like a outer class!
public class MemberInnerClassDemo {
	private int num;

	// default constructor
	public MemberInnerClassDemo() {
		num = 10;
	}

//	Inner class
	public class Inner {
		private int no;

		public Inner() {
			no = 103;
		}

		public void getNo() {
			System.out.println("no: " + no);
			System.out.println("num: " + num);
		}
	}

	public static void main(String[] args) {
		Inner obj = new MemberInnerClassDemo().new Inner();
		obj.getNo();
	}
}
