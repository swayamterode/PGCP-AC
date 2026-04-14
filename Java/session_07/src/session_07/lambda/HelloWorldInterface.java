package session_07.lambda;

@FunctionalInterface
public interface HelloWorldInterface {
	int no = 100;

	public String sayHello();

	public static void getNo() {
		System.out.println("No: " + no);
	}

	public default void get() {
		System.out.println("Java 8 default method");
	}
}
