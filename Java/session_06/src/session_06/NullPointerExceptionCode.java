package session_06;

public class NullPointerExceptionCode {
	public static void main(String[] args) {
		String name = null;
//		String name = null; // Exception in thread "main" java.lang.NullPointerException: Cannot invoke
		// "String.length()" because "name" is null
		// at session_06.NullPointerExceptionCode.main(NullPointerExceptionCode.java:6)
		try {
			System.out.println(name.length());
		} catch (Exception e) {
			System.err.println("String is null");
		}
	}
}
