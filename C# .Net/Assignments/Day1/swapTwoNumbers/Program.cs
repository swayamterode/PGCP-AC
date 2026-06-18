using System;

class Program
{
    static void Main(string[] args)
    {
        int num1, num2, temp;

        Console.Write("Enter first number: ");
        num1 = Convert.ToInt32(Console.ReadLine());

        Console.Write("Enter second number: ");
        num2 = Convert.ToInt32(Console.ReadLine());

        Console.WriteLine("Before swap: num1 = " + num1 + ", num2 = " + num2);

        temp = num1;
        num1 = num2;
        num2 = temp;

        Console.WriteLine("After swap: num1 = " + num1 + ", num2 = " + num2);
    }
}