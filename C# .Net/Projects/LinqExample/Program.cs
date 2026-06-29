using LinqExample.Model;

namespace LinqExample;

class Program
{
    static void Main(string[] args)
    {
        List<Department> department = new List<Department>
        {
            new Department { DeptId = 1, DepartmentName = "CSE" },
            new Department { DeptId = 2, DepartmentName = "MECH" },
            new Department { DeptId = 3, DepartmentName = "ENTC" },
        };

        List<Student> students = new List<Student>
        {
            new Student { StudentId = 1, StudentName = "Amit", Age = 20, DeptId = 1 },
            new Student { StudentId = 2, StudentName = "Riya", Age = 22, DeptId = 2 },
            new Student { StudentId = 3, StudentName = "Sahil", Age = 19, DeptId = 1 },
            new Student { StudentId = 4, StudentName = "Neha", Age = 23, DeptId = 3 },
            new Student { StudentId = 5, StudentName = "Karan", Age = 21, DeptId = 2 },
            new Student { StudentId = 6, StudentName = "Ram", Age = 22, DeptId = 5 }
        };
        InnerJoinDemo(students, department);

        static void InnerJoinDemo(List<Student> students, List<Department> department)
        {
            var result = from s in students
                join d in department on s.DeptId equals d.DeptId
                select new
                {
                    s.StudentName,
                    s.Age,
                    d.DepartmentName
                };
            foreach (var item in result)
            {
                Console.WriteLine($"{item.StudentName,-8} | Age: {item.Age,-3} | Dept: {item.DepartmentName}");
            }

            Console.WriteLine();
        }
    }
}