using System;

class Program
{
    static void Main(string[] args)
    {
        Console.Write("Enter first number: ");
        double num1 = Convert.ToDouble(Console.ReadLine());

        Console.Write("Enter second number: ");
        double num2 = Convert.ToDouble(Console.ReadLine());

        Console.WriteLine("\nMenu:");
        Console.WriteLine("1. Addition");
        Console.WriteLine("2. Subtraction");
        Console.WriteLine("3. Multiplication");
        Console.WriteLine("4. Division");
        Console.WriteLine("5. Modulus");

        Console.Write("\nEnter your choice: ");
        int choice = Convert.ToInt32(Console.ReadLine());

        switch (choice)
        {
            case 1:
                Console.WriteLine("Result: " + (num1 + num2));
                break;

            case 2:
                Console.WriteLine("Result: " + (num1 - num2));
                break;

            case 3:
                Console.WriteLine("Result: " + (num1 * num2));
                break;

            case 4:
                if (num2 != 0)
                {
                    Console.WriteLine("Result: " + (num1 / num2));
                }
                else
                {
                    Console.WriteLine("Error: Division by zero is not allowed.");
                }
                break;

            case 5:
                if (num2 != 0)
                {
                    Console.WriteLine("Result: " + (num1 % num2));
                }
                else
                {
                    Console.WriteLine("Error: Modulus by zero is not allowed.");
                }
                break;

            default:
                Console.WriteLine("Invalid choice. Please select between 1-5.");
                break;
        }
    }
}