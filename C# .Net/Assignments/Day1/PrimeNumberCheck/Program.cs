using System;

namespace PrimeNumberCheck
{
    class Program
    {
        static bool IsPrime(int num)
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
            Console.Write("Enter a number to check if it is prime: ");
            int userNum = Convert.ToInt32(Console.ReadLine());

            if (IsPrime(userNum))
                Console.WriteLine($"{userNum} is a Prime number.");
            else
                Console.WriteLine($"{userNum} is NOT a Prime number.");

            Console.WriteLine("\nFirst 25 prime numbers (using while loop):");
            int countWhile = 0;
            int numWhile = 2;
            while (countWhile < 25)
            {
                if (IsPrime(numWhile))
                {
                    Console.Write(numWhile + " ");
                    countWhile++;
                }
                numWhile++;
            }
            Console.WriteLine();

            Console.WriteLine("\nFirst 25 prime numbers (using for loop):");
            int countFor = 0;
            for (int numFor = 2; countFor < 25; numFor++)
            {
                if (IsPrime(numFor))
                {
                    Console.Write(numFor + " ");
                    countFor++;
                }
            }
            Console.WriteLine();
            
            Console.WriteLine("\nFirst 25 prime numbers (using do-while loop):");
            int countDo = 0;
            int numDo = 2;
            do
            {
                if (IsPrime(numDo))
                {
                    Console.Write(numDo + " ");
                    countDo++;
                }
                numDo++;
            } while (countDo < 25);

            Console.WriteLine();
        }
    }
}