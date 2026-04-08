public class Person {
	private String name;
	private int age;

	Person() {
		this.age = 18;
	}

	Person(String name, int age) {
		this();
		this.name = name;
		this.age = age;
	}

//	public void display() {
//		System.out.println("Name: " + name + ", Age: " + age);
//	}

	public String toString() {
		return "Name: " + name + ", age: " + age;
	}

	public static void main(String[] args) {
		Person obj = new Person();
		Person obj2 = new Person("Swayam", 34);
		System.out.println(obj2);
		System.out.println(obj);
	}
}