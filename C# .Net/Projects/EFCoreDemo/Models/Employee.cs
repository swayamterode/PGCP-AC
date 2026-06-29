using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace EFCoreDemo.Models;

public class Employee
{
    [Key] public int EmpId { get; set; }

    [Required] [StringLength(100)] public string EmpName { get; set; } = string.Empty;

    [Required] [Range(15000, 50000)] public decimal Salary { get; set; }

    [EmailAddress] [StringLength(100)] public string Email { get; set; } = string.Empty;

    //foreign key for department
    [ForeignKey("Department")] public int DepartmentId { get; set; }

    //navigation property for department
    public Department? Department { get; set; }
}