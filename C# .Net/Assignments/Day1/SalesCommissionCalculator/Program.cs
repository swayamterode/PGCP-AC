using System;
class Program
{
    static void Main(string[] args)
    {
        Console.Write("Enter basic salary: ");
        double basicSalary = Convert.ToDouble(Console.ReadLine());
        Console.Write("Enter total sales amount: ");
        double totalSales = Convert.ToDouble(Console.ReadLine());

        double rate;
        if (basicSalary >= 5000 && basicSalary <= 7500)
            rate = 3;
        else if (basicSalary > 7500 && basicSalary <= 10500)
            rate = 8;
        else if (basicSalary > 10500 && basicSalary <= 15000)
            rate = 11;
        else
            rate = 15;

        double commissionOnSales = totalSales * rate / 100;
        Console.WriteLine("Commission on sales: " + commissionOnSales);
    }
}
