package session_08.classroom.serialization;

import java.io.Serializable;

public class SerializationInterface implements Serializable {
	private static final long serialVersionUID = 1L;
	private int age;
	private String name;

	public SerializationInterface() {
		this.age = 0;
		this.name = null;
	}

	public SerializationInterface(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "[age= " + age + ", name= " + name + "]";
	}

}
