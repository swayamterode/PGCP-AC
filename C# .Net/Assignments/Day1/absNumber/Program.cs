class Program
{
    static void Main(String[] args)
    {
        Console.Write("Enter a number: ");
        int num = Convert.ToInt32(Console.ReadLine());

        int absoluteValue = (num < 0) ? -num : num;

        Console.WriteLine("Absolute value: " + absoluteValue);
    }
}