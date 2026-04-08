public class ConstructorDemo {
	private int empID;
	private String empName;
	private int empSalary;

//	Default constructor
	public ConstructorDemo() {
		System.out.println("Default Constructor called!");
		empID = 1;
		empName = "Swayam";
		empSalary = 5000000;
	}

//	parameterized Constructor
	public ConstructorDemo(int id, String name, int salary) {
		System.out.println("Parameterized Constructor called!");
		empID = id;
		empName = name;
		empSalary = salary;
	}

	public String toString() {
		return "Employee Details: \n" + empID + ", Emp Name: " + empName + " ,Emp Salary: " + empSalary + "\n\n";
	}

	public static void main(String[] args) {
		ConstructorDemo obj1 = new ConstructorDemo();
		System.out.println(obj1);
		ConstructorDemo obj2 = new ConstructorDemo(2, "Jay", 223234);
		System.out.println(obj2);
	}
}
