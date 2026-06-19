using System;

namespace PositiveCombinations123
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] digits = { 1, 2, 3 };

            Console.WriteLine("All positive combinations of 1, 2, 3:");

            for (int i = 0; i < digits.Length; i++)
            {
                for (int j = 0; j < digits.Length; j++)
                {
                    for (int k = 0; k < digits.Length; k++)
                    {
                        Console.WriteLine($"{digits[i]}{digits[j]}{digits[k]}");
                    }
                }
            }
        }
    }
}