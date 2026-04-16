package session_08.classroom.seralization;

import java.io.Serializable;

public class SeralizationDemo implements Serializable {
	private static final long serialVersionUID = 1L;
	private int age;
	private String name;

	public SeralizationDemo() {
		this.age = 0;
		this.name = null;
	}

	public SeralizationDemo(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "[age= " + age + ", name= " + name + "]";
	}

}
