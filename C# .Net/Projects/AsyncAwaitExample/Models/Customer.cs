using System.ComponentModel.DataAnnotations;

namespace AsyncAwaitExample.Models;

public class Customer
{
    [Key] public int CustomerId { get; set; }

    [Required(ErrorMessage = "Customer name is required!")]
    [StringLength(100, ErrorMessage = "Customer name should not exceed 100 chars!")]
    public string CustomerName { get; set; } = string.Empty;

    [Required(ErrorMessage = "City is required!")]
    [StringLength(60, ErrorMessage = "City name should not exceed 60 chars!")]
    public string City { get; set; } = string.Empty;
}