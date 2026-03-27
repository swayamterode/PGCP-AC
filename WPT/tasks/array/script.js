// Array of 10 employees
const employees = [
  { id: 1, name: "Amit", post: "Manager", salary: 55000, gender: "Male", age: 45, city: "Pune", department: "Sales" },
  { id: 2, name: "Sneha", post: "HR Executive", salary: 40000, gender: "Female", age: 30, city: "Mumbai", department: "HR" },
  { id: 3, name: "Rahul", post: "Developer", salary: 70000, gender: "Male", age: 28, city: "Bangalore", department: "IT" },
  { id: 4, name: "Priya", post: "HR Manager", salary: 60000, gender: "Female", age: 50, city: "Delhi", department: "HR" },
  { id: 5, name: "Vikas", post: "Sales Executive", salary: 35000, gender: "Male", age: 38, city: "Pune", department: "Sales" },
  { id: 6, name: "Anjali", post: "Developer", salary: 50000, gender: "Female", age: 26, city: "Hyderabad", department: "IT" },
  { id: 7, name: "Ramesh", post: "Clerk", salary: 25000, gender: "Male", age: 58, city: "Chennai", department: "Admin" },
  { id: 8, name: "Kavita", post: "Accountant", salary: 45000, gender: "Female", age: 42, city: "Mumbai", department: "Finance" },
  { id: 9, name: "Suresh", post: "Manager", salary: 80000, gender: "Male", age: 60, city: "Delhi", department: "Admin" },
  { id: 10, name: "Pooja", post: "HR Executive", salary: 32000, gender: "Female", age: 29, city: "Pune", department: "HR" },
];

// 1. Display all employees
console.log("All Employees:", employees);

// 2. Female employees
const femaleEmployees = employees.filter((emp) => emp.gender === "Female");
console.log("Female Employees:", femaleEmployees);

// 3. HR employees
const hrEmployees = employees.filter((emp) => emp.department === "HR");
console.log("HR Employees:", hrEmployees);

// 4. Salary between 30000 and 60000
const midSalaryEmployees = employees.filter((emp) => emp.salary > 30000 && emp.salary < 60000);
console.log("Salary between 30k and 60k:", midSalaryEmployees);

// 5. Age > 55
const seniorEmployees = employees.filter((emp) => emp.age > 55);
console.log("Employees age > 55:", seniorEmployees);

// 6. Employees belonging to same department (grouped)
const groupedByDept = employees.reduce((acc, emp) => {
  if (!acc[emp.department]) {
    acc[emp.department] = [];
  }
  acc[emp.department].push(emp);
  return acc;
}, {});
console.log("Employees grouped by department:", groupedByDept);
