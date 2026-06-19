using System;
namespace DateInputDisplay
{
    class Program
    {
        static void getDate(out int day, out int month, out int year)
        {
            Console.Write("Enter day: ");
            day = Convert.ToInt32(Console.ReadLine());

            Console.Write("Enter month: ");
            month = Convert.ToInt32(Console.ReadLine());

            Console.Write("Enter year: ");
            year = Convert.ToInt32(Console.ReadLine());
        }

        static void Main(string[] args)
        {
            int d, m, y;
            getDate(out d, out m, out y);
            Console.WriteLine($"\nEntered Date: {d:D2}/{m:D2}/{y}");
            try
            {
                DateTime dt = new DateTime(y, m, d);
                Console.WriteLine($"Formatted Date: {dt:dd MMMM yyyy}");
            }
            catch (ArgumentOutOfRangeException)
            {
                Console.WriteLine("Note: The entered date is not a valid calendar date.");
            }
        }
    }
}