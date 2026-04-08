import java.util.Scanner;

public class CalculateArea {
	private double radius;
	private double area;
	private double pi = 3.14;

	public void init(double r) {
		radius = r;
	}

	public void calculateArea() {
		area = pi * (radius * radius);
	}

	public void display() {
		System.out.println("Area of Circle: " + area + "mm^2");
	}

	public static void main(String[] args) {
		CalculateArea obj = new CalculateArea();
		Scanner sc = new Scanner(System.in);
		double radius;
		System.out.print("Enter the radius: ");
		radius = sc.nextDouble();

		obj.init(radius); // initialized values!
		obj.calculateArea(); // calculated area!

		obj.display(); // displayed the area
		sc.close();
	}
}
