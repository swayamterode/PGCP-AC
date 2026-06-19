using System;

namespace NumberPatternPrint
{
    class Program
    {
        static void Main(string[] args)
        {
            int rows = 3;

            for (int i = 1; i <= rows; i++)
            {
                for (int left = 1; left <= i; left++)
                {
                    Console.Write(left + "\t");
                }
                for (int right = i - 1; right >= 1; right--)
                {
                    Console.Write(right + "\t");
                }

                if (i > 1)
                    Console.Write(i);

                Console.WriteLine();
            }
        }
    }
}