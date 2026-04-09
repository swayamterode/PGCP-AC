package p1;

public class Student {
	public static int fees = 1000;

	Student() {
		fees = fees + 10;
	}

//	static {
//		fees = 400;
//	}

//	static {
//		fees += 500;
//	}

	public static void main(String[] args) {
		System.out.println(Student.fees);
//		System.out.println("Fees: " + fees);
	}
}
