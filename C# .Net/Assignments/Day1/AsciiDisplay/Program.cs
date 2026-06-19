using System;

namespace AsciiDisplay
{
    class Program
    {
        static void Main(string[] args)
        {
            int count = 0;

            for (int i = 0; i <= 255; i++)
            {
                // Some values are non-printable control characters, show code + char safely
                Console.WriteLine($"{i}\t: {(char)i}");
                count++;

                if (count % 10 == 0)
                {
                    Console.WriteLine("\nPress any key to continue...");
                    Console.ReadKey();
                    Console.WriteLine();
                }
            }

            Console.WriteLine("\nDone displaying all ASCII characters (0-255).");
        }
    }
}