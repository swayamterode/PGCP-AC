package assignments;

import java.util.Scanner;

//In a company an employee is paid as under:
//If his basic salary is less than Rs. 1500, then HRA = 10% of basic salary 
//and DA = 90% of basic salary.
//If his salary is either equal to or above Rs. 1500, then HRA = Rs. 500
//and DA = 98% of basic salary.
//If the employee's salary is input by the user write a program to find his gross salary. GS=Basic+DA+HRA

public class GrossSalary {
	protected double hra;
	protected double da;

	public double calculateSalary(double basicSalary) {
		if (basicSalary < 1500) {
			this.hra = basicSalary * 0.1;
			this.da = basicSalary * 0.9;
		}
		if (basicSalary >= 1500) {
			this.hra = 500.00;
			this.da = basicSalary * 0.98;
		}
		return 0.0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double basicSalary;
		System.out.print("Input salary: ");
		basicSalary = sc.nextDouble();

		GrossSalary obj = new GrossSalary();
		System.out.println(obj.calculateSalary(basicSalary));

		sc.close();
	}
}
