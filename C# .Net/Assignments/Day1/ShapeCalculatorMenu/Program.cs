using System;

namespace ShapeCalculatorMenu
{
    class Program
    {
        static double SquareArea(double side) => side * side;
        static double SquarePerimeter(double side) => 4 * side;
        static double CircleArea(double radius) => Math.PI * radius * radius;
        static double CirclePerimeter(double radius) => 2 * Math.PI * radius;
        static double RectangleArea(double length, double width) => length * width;
        static double RectanglePerimeter(double length, double width) => 2 * (length + width);

        static void Main(string[] args)
        {
            Console.WriteLine("Select a Shape:");
            Console.WriteLine("1. Square");
            Console.WriteLine("2. Circle");
            Console.WriteLine("3. Rectangle");
            Console.Write("Enter choice (1-3): ");
            int shapeChoice = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("\nSelect Operation:");
            Console.WriteLine("1. Calculate Area");
            Console.WriteLine("2. Calculate Perimeter");
            Console.WriteLine("3. Calculate Area and Perimeter both");
            Console.Write("Enter choice (1-3): ");
            int opChoice = Convert.ToInt32(Console.ReadLine());

            double area = 0, perimeter = 0;
            bool areaCalculated = false, perimeterCalculated = false;

            switch (shapeChoice)
            {
                case 1:
                    Console.Write("Enter side length: ");
                    double side = Convert.ToDouble(Console.ReadLine());

                    if (opChoice == 1 || opChoice == 3)
                    {
                        area = SquareArea(side);
                        areaCalculated = true;
                    }
                    if (opChoice == 2 || opChoice == 3)
                    {
                        perimeter = SquarePerimeter(side);
                        perimeterCalculated = true;
                    }
                    break;

                case 2:
                    Console.Write("Enter radius: ");
                    double radius = Convert.ToDouble(Console.ReadLine());

                    if (opChoice == 1 || opChoice == 3)
                    {
                        area = CircleArea(radius);
                        areaCalculated = true;
                    }
                    if (opChoice == 2 || opChoice == 3)
                    {
                        perimeter = CirclePerimeter(radius);
                        perimeterCalculated = true;
                    }
                    break;

                case 3:
                    Console.Write("Enter length: ");
                    double length = Convert.ToDouble(Console.ReadLine());
                    Console.Write("Enter width: ");
                    double width = Convert.ToDouble(Console.ReadLine());

                    if (opChoice == 1 || opChoice == 3)
                    {
                        area = RectangleArea(length, width);
                        areaCalculated = true;
                    }
                    if (opChoice == 2 || opChoice == 3)
                    {
                        perimeter = RectanglePerimeter(length, width);
                        perimeterCalculated = true;
                    }
                    break;

                default:
                    Console.WriteLine("Invalid shape choice.");
                    return;
            }

            Console.WriteLine();
            if (areaCalculated)
                Console.WriteLine($"Area = {area:F2}");
            if (perimeterCalculated)
                Console.WriteLine($"Perimeter = {perimeter:F2}");
        }
    }
}