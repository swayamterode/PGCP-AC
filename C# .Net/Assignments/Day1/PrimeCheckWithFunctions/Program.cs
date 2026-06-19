using System;

namespace PrimeCheckWithFunctions
{
    class Program
    {
        static bool Check(int num)
        {
            return num >= 0;
        }

        static bool Prime(int num)
        {
            if (num < 2) return false;
            for (int i = 2; i <= Math.Sqrt(num); i++)
            {
                if (num % i == 0) return false;
            }
            return true;
        }

        static void Main(string[] args)
        {
            int number;

            while (true)
            {
                Console.Write("Enter a number: ");
                number = Convert.ToInt32(Console.ReadLine());

                bool isPositive = Check(number);

                if (!isPositive)
                {
                    Console.WriteLine("Number is negative. Please re-enter the number.");
                    continue;
                }
                else
                {
                    Console.WriteLine($"Positive number entered: {number}");
                    break;
                }
            }

            bool result = Prime(number);

            if (result)
                Console.WriteLine($"{number} is a Prime number.");
            else
                Console.WriteLine($"{number} is NOT a Prime number.");
        }
    }
}