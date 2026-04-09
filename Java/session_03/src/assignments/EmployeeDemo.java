package assignments;

import java.util.Scanner;

// Employee class ka demo — user se salary input lekar employees banata hai
public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Employee Management ===");
        System.out.print("Kitne employees banana hai: ");
        int n = sc.nextInt();

        Employee[] employees = new Employee[n];

        // Har employee ke liye salary lo aur object banao
        for (int i = 0; i < n; i++) {
            System.out.print("Employee " + (i + 1) + " ki salary enter karo: ");
            double salary = sc.nextDouble();
            employees[i] = new Employee(salary); // Constructor auto-increment karega empNo
        }

        // Sabhi employees ki info print karo
        System.out.println("\nSabhi Employees ki Details:");
        for (Employee e : employees) {
            e.display();
        }

        // Static class method se total stats dikhao
        System.out.println();
        Employee.displayStats();

        sc.close();
    }
}
