using System;

namespace FibonacciSeries
{
    class Program
    {
        static void PrintFibonacci(int terms)
        {
            if (terms <= 0)
            {
                Console.WriteLine("Number of terms must be positive.");
                return;
            }

            long first = 0, second = 1;

            Console.Write("Fibonacci Series: ");

            for (int i = 1; i <= terms; i++)
            {
                Console.Write(first + " ");
                long next = first + second;
                first = second;
                second = next;
            }

            Console.WriteLine();
        }

        static void Main(string[] args)
        {
            Console.Write("Enter number of terms: ");
            int n = Convert.ToInt32(Console.ReadLine());

            PrintFibonacci(n);
        }
    }
}