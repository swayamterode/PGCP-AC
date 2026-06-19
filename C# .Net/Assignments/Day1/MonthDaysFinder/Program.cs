using System;

class Program
{
    static void Main(string[] args)
    {
        Console.Write("Enter date (dd/mm/yy): ");
        string dateInput = Console.ReadLine();

        string[] parts = dateInput.Split('/');

        int day = Convert.ToInt32(parts[0]);
        int month = Convert.ToInt32(parts[1]);
        int year = Convert.ToInt32(parts[2]);

        string monthName;
        int totalDays;

        switch (month)
        {
            case 1:
                monthName = "January";
                totalDays = 31;
                break;
            case 2:
                monthName = "February";
                totalDays = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? 29 : 28;
                break;
            case 3:
                monthName = "March";
                totalDays = 31;
                break;
            case 4:
                monthName = "April";
                totalDays = 30;
                break;
            case 5:
                monthName = "May";
                totalDays = 31;
                break;
            case 6:
                monthName = "June";
                totalDays = 30;
                break;
            case 7:
                monthName = "July";
                totalDays = 31;
                break;
            case 8:
                monthName = "August";
                totalDays = 31;
                break;
            case 9:
                monthName = "September";
                totalDays = 30;
                break;
            case 10:
                monthName = "October";
                totalDays = 31;
                break;
            case 11:
                monthName = "November";
                totalDays = 30;
                break;
            case 12:
                monthName = "December";
                totalDays = 31;
                break;
            default:
                monthName = "Invalid Month";
                totalDays = 0;
                break;
        }

        Console.WriteLine("\nMonth: " + monthName);
        Console.WriteLine("Total days in this month: " + totalDays);
    }
}