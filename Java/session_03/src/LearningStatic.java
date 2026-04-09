public class LearningStatic {
	private int rn; // instance variable
	private String name;
	private static int count; // static variable

//	default constructor
	public LearningStatic() {
		this.rn = 0;
		this.name = "Test User";
		count++;
	}

//	parameterized constructor
	public LearningStatic(int rn, String name) {
		this.rn = rn;
		this.name = name;
		count++;
	}

	public String toString() {
		return "Learning Static [rn=" + rn + ", name=" + name + "count" + count + "]";
	}

//	static method getCount -> which prints count!
	public static void getCount() {
		System.out.println("Count: " + count);
	}

//	 static block gets called at before main method!
	static {
		System.out.println("Static Block Called!");
		count = 10;
	}

	public static void main(String[] args) {
		LearningStatic obj = new LearningStatic();
		LearningStatic.getCount();
		System.out.println(obj.name + ", Roll No.: " + obj.rn);

		LearningStatic obj2 = new LearningStatic(84, "Swayam Terode");
		LearningStatic.getCount();
		System.out.println(obj2.name + ", Roll No.: " + obj2.rn);
	}
}
