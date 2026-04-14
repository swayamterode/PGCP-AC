package session_07.lambda;

public class HelloWorldLambda {
	public static void main(String[] args) {
		HelloWorldInterface obj = () -> "Hello Java!";
		System.out.println(obj.sayHello());

		obj.get();
		HelloWorldInterface.getNo();
	}
}
