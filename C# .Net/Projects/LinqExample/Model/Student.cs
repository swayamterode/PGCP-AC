using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace LinqExample.Model;

public class Student
{
    [Key] public int StudentId { get; set; }

    [Required(ErrorMessage = "Student name is required")]
    [StringLength(100, ErrorMessage = "Student name should be at leat 100")]
    public string StudentName { get; set; } = string.Empty;

    [Range(15, 100, ErrorMessage = "The age must be in the range!")]
    public int Age { get; set; }

    [ForeignKey("Department")] public int DeptId { get; set; }
    
    public Department Department { get; set; }
}