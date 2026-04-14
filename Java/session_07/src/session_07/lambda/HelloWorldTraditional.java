package session_07.lambda;

public class HelloWorldTraditional implements HelloWorldInterface {

	@Override
	public String sayHello() {
		return "Hello World";
	}

	public static void main(String[] args) {
		HelloWorldTraditional obj = new HelloWorldTraditional();
		System.out.println(obj.sayHello());
	}

}
