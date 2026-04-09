# Session 03 — Arrays, Static & OOP Assignments

**Path:** `session_03/src/`

> Covers static keyword, arrays (1D, 2D, jagged), and OOP-based assignment programs.

---

## Root-Level Programs

| #   | File                                                       | Description                                           | Level        |
| --- | ---------------------------------------------------------- | ----------------------------------------------------- | ------------ |
| 1   | [LearningStatic.java](LearningStatic.java)                 | Static variable, static block, and static method demo | Intermediate |
| 2   | [JaggedArray.java](JaggedArray.java)                       | Jagged (irregular) 2D array creation and traversal    | Intermediate |
| 3   | [AverageMarksOfStudents.java](AverageMarksOfStudents.java) | Array of student marks with average calculation       | Elementary   |
| 4   | [SwapDates.java](SwapDates.java)                           | Swapping date values using object references          | Intermediate |

---

## Assignments Package (`assignments/`)

| #   | File                                                               | Description                                                                                      | Level        |
| --- | ------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------ |
| 1   | [SumAndAverage.java](assignments/SumAndAverage.java)               | Sum and average of array elements, user input                                                    | Beginner     |
| 2   | [SortArrayInDesc.java](assignments/SortArrayInDesc.java)           | Sort array in descending order                                                                   | Elementary   |
| 3   | [GrossSalary.java](assignments/GrossSalary.java)                   | Calculate gross salary using OOP                                                                 | Elementary   |
| 4   | [ArrayDemo.java](assignments/ArrayDemo.java)                       | Jagged array of 17 elements in 5 rows; user input; sum                                           | Intermediate |
| 5   | [MatrixMultiplication.java](assignments/MatrixMultiplication.java) | 3×3 matrix multiplication with user input                                                        | Intermediate |
| 6   | [MatrixTranspose.java](assignments/MatrixTranspose.java)           | Transpose of any m×n matrix; user provides size and elements                                     | Intermediate |
| 7   | [Employee.java](assignments/Employee.java)                         | Employee class — auto-increment `empNo`, static `totalSalary`, class-level `displayStats()`      | Intermediate |
| 8   | [EmployeeDemo.java](assignments/EmployeeDemo.java)                 | Driver for Employee — user enters n salaries, stats displayed                                    | Intermediate |
| 9   | [Product.java](assignments/Product.java)                           | Product class with `pid`, `price`, `quantity` and parameterized constructor                      | Elementary   |
| 10  | [XYZ.java](assignments/XYZ.java)                                   | Accepts 5 products from user; finds PID of highest-priced product; calculates total amount spent | Advanced     |

---

## LearningStatic — Static Concepts

## Static Variable

```java
private static int count;
```

- Shared across **all objects** of the class — only one copy exists
- Incremented in both constructors via `count++`

---

## Static Block

```java
static {
    System.out.println("Static Block Called!");
    count = 10;
}
```

- Runs **once**, automatically, when the cl
- ass is loaded into memory
- Executes **before** `main()` and before any object is created
- Used here to initialize `count` to `10`

---

## Static Method

```java
public static void getCount() {
    System.out.println("Count: " + count);
}
```

- Belongs to the **class**, not to any object
- Called as `LearningStatic.getCount()` — no object needed
- Can only access static variables directly

---

## Execution Order

1. Static block runs → prints `Static Block Called!`, sets `count = 10`
2. `main()` starts
3. Each `new LearningStatic(...)` increments `count` by 1
