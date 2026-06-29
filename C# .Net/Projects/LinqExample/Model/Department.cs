using System.ComponentModel.DataAnnotations;

namespace LinqExample.Model;

public class Department
{
    [Key] public int DeptId { get; set; }

    [Required(ErrorMessage = "Department name is required!")]
    [StringLength(50, ErrorMessage = "Department name cannot exceed 50 characters")]
    public string DepartmentName { get; set; } = string.Empty;
}