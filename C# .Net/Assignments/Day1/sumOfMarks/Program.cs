using System;

class Program
{
    static void Main(String [] args)
    {
        int[] marks = new int [5];
        int sum = 0;

        for(int i = 0; i < 5; i++)
        {
            Console.Write("Enter the marks for the " + (i + 1) + " : ");
            marks[i] = Convert.ToInt32(Console.ReadLine());
            sum += marks[i];
        }

        Console.WriteLine("Sum of marks: " + sum);
    }
}
