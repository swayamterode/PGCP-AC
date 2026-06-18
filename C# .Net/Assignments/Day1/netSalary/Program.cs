using System;

class Program
{
    static void Main(string[] args)
    {
        Console.Write("Enter the basic salary: ");
        double basicSalary = Convert.ToDouble(Console.ReadLine());

        double hra = basicSalary * 20 / 100;
        double da = basicSalary * 40 / 100;
        double grossSalary = basicSalary + hra + da;
        double pf = grossSalary * 10 / 100;
        double netSalary = grossSalary - pf;

        Console.WriteLine("HRA: " + hra);
        Console.WriteLine("DA: " + da);
        Console.WriteLine("Gross Salary: " + grossSalary);
        Console.WriteLine("PF: " + pf);
        Console.WriteLine("Net Salary: " + netSalary);
    }
}