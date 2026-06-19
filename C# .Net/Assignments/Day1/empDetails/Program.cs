using System;

class Program
{
    static void Main(string[] args)
    {
        Console.Write("Enter Employee No: ");
        int empNo = Convert.ToInt32(Console.ReadLine());

        Console.Write("Enter Department No: ");
        int deptNo = Convert.ToInt32(Console.ReadLine());

        Console.Write("Enter Designation Code: ");
        
        // Safely handle possible null from Console.ReadLine()
        string designationInput = Console.ReadLine() ?? string.Empty;
        char designationCode = designationInput.Length > 0 ? designationInput[0] : '\0';

        string deptName;
        string designation;

        switch (deptNo)
        {
            case 10:
                deptName = "Purchase";
                break;
            case 20:
                deptName = "Sales";
                break;
            case 30:
                deptName = "Production";
                break;
            case 40:
                deptName = "Marketing";
                break;
            case 50:
                deptName = "Accounts";
                break;
            default:
                deptName = "Invalid Department No";
                break;
        }

        switch (designationCode)
        {
            case 'M':
                designation = "Manager";
                break;
            case 'S':
                designation = "Supervisor";
                break;
            case 'A':
                designation = "Analyst";
                break;
            case 's':
                designation = "Sales Person";
                break;
            case 'a':
                designation = "Accountant";
                break;
            default:
                designation = "Invalid Designation Code";
                break;
        }

        Console.WriteLine("\n--- Employee Details ---");
        Console.WriteLine("Employee No: " + empNo);
        Console.WriteLine("Department No: " + deptNo + " (" + deptName + ")");
        Console.WriteLine("Designation Code: " + designationCode + " (" + designation + ")");
    }
}