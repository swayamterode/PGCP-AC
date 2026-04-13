package session_06;

public class IllegalArgumentExample {

	private int age;
	private String username;

	public void setAge(int age) {
		if (age < 0 || age > 150) {
			throw new IllegalArgumentException("Age must be between 0 and 150, got: " + age);
		}
		this.age = age;
	}

	public void setUsername(String username) {
		if (username == null || username.isBlank()) {
			throw new IllegalArgumentException("Username cannot be null or blank");
		}
		if (username.length() < 3) {
			throw new IllegalArgumentException("Username must be at least 3 characters, got: " + username.length());
		}
		this.username = username;
	}

	public static void main(String[] args) {
		IllegalArgumentExample user = new IllegalArgumentExample();

		try {
			user.setAge(-10);
		} catch (IllegalArgumentException e) {
			System.out.println("Caught: " + e.getMessage());
		}

		try {
			user.setUsername("ab");
		} catch (IllegalArgumentException e) {
			System.out.println("Caught: " + e.getMessage());
		}

		user.setAge(25);
		user.setUsername("alice");
		System.out.println("User created successfully");
	}
}
