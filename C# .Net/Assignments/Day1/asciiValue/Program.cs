using System;

class Program
{
    static void Main(string[] args)
    {
        Console.Write("Enter a character: ");
        char ch = Convert.ToChar(Console.ReadLine());

        int ascii = (int)ch;
        Console.WriteLine("ASCII value of " + ch + " is: " + ascii);
    }
}