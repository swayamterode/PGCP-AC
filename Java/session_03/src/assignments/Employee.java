package assignments;

// Employee class — empNo auto-increment, totalSalary sabki salary ka total
public class Employee {

    // Static variables — class level pe store hote hain, sab objects share karte hain
    private static int empCounter = 100;   // Auto-increment ke liye counter, 100 se shuru
    private static double totalSalary = 0; // Sabhi employees ki combined salary
    private static int totalEmployees = 0; // Kitne employees bane hain abtak

    // Instance variables — har employee ke apne alag values
    private int empNo;
    private double salary;

    // Sirf parameterized constructor allowed hai
    public Employee(double salary) {
        this.empNo = empCounter++;     // Auto-increment — pehle assign karo, phir badhao
        this.salary = salary;
        totalSalary += salary;         // Har naye employee ki salary total mein add karo
        totalEmployees++;              // Employee count badhao
    }

    // Getter — empNo bahar dikhane ke liye
    public int getEmpNo() {
        return empNo;
    }

    // Getter — is employee ki salary
    public double getSalary() {
        return salary;
    }

    // Class method (static) — total employees aur total salary display karta hai
    public static void displayStats() {
        System.out.println("--- Employee Statistics ---");
        System.out.println("Total Employees  : " + totalEmployees);
        System.out.println("Total Salary     : " + totalSalary);
    }

    // Individual employee ki info print karo
    public void display() {
        System.out.println("Emp No: " + empNo + " | Salary: " + salary);
    }
}
