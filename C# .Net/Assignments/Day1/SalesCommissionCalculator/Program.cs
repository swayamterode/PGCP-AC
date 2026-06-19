using System;
class Program
{
    static void Main(String[] args)
    {
        Console.Write("Enter a year: ");
        int year = Convert.ToInt32(Console.ReadLine());
          string result = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                         ? year + " is a Leap Year."
                         : year + " is not a Leap Year.";

        Console.WriteLine(result);
    }
}