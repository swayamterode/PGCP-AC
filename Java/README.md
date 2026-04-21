# Java

A collection of Java programs organized by session, covering core Java fundamentals and Object-Oriented Programming concepts.

---

## Table of Contents

- [Java](#java)
  - [Table of Contents](#table-of-contents)
  - [Session 01 — Java Basics](#session-01--java-basics)
  - [Session 02 — Object-Oriented Programming](#session-02--object-oriented-programming)
  - [Session 03 — Arrays, Static \& OOP Assignments](#session-03--arrays-static--oop-assignments)
    - [Root-Level Programs](#root-level-programs)
    - [Assignments](#assignments)
  - [Session 06 — File Handling, Exception Handling \& Date Formatting](#session-06--file-handling-exception-handling--date-formatting)
    - [Exception Handling](#exception-handling)
    - [Assertion](#assertion)
    - [Date Formatting \& Parsing](#date-formatting--parsing)
    - [File Handling](#file-handling)
  - [Session 07 — Inner Classes, Lambda Expressions \& String Methods](#session-07--inner-classes-lambda-expressions--string-methods)
    - [Inner Classes](#inner-classes)
    - [Lambda Expressions](#lambda-expressions)
    - [String Methods](#string-methods)
  - [Session 08 — Serialization \& ArrayList](#session-08--serialization--arraylist)
    - [Serialization](#serialization)
    - [ArrayList](#arraylist)
  - [Session 09 — Vector, Stack \& Arrays.asList](#session-09--vector-stack--arraysaslist)
    - [Vector](#vector)
    - [Stack](#stack)
    - [Arrays.asList](#arraysaslist)
  - [Session 10 — Comparable \& Comparator](#session-10--comparable--comparator)
    - [ArrayList with Comparator](#arraylist-with-comparator)
    - [TreeSet with Comparable](#treeset-with-comparable)
  - [Session 11 — Advanced I/O, Functional Programming \& Method References](#session-11--advanced-io-functional-programming--method-references)
    - [Root-Level Demos](#root-level-demos)
    - [Buffered I/O](#buffered-io)
    - [File API](#file-api)
    - [Functional Interfaces](#functional-interfaces)
    - [Method References](#method-references)
    - [NIO](#nio)
    - [Regex](#regex)
    - [RandomAccessFile](#randomaccessfile)
  - [Session 12 — Streams API \& Functional Data Processing](#session-12--streams-api--functional-data-processing)
    - [Core Classes](#core-classes)
    - [Stream Operations](#stream-operations)

---

## Session 01 — Java Basics

**Path:** `session_01/src/`

> Ordered from beginner to advanced.

| #   | File                                                                      | Description                                           | Level        |
| --- | ------------------------------------------------------------------------- | ----------------------------------------------------- | ------------ |
| 1   | [HelloWorld.java](session_01/src/HelloWorld.java)                         | First Java program — printing to the console          | Beginner     |
| 2   | [WhileLoop.java](session_01/src/WhileLoop.java)                           | Simple counting loop with `while`                     | Beginner     |
| 3   | [CheckNumberIsOddOrEven.java](session_01/src/CheckNumberIsOddOrEven.java) | `if/else` condition with user input                   | Beginner     |
| 4   | [CheckGraterOfTwoNumber.java](session_01/src/CheckGraterOfTwoNumber.java) | Ternary operator to compare two numbers               | Elementary   |
| 5   | [UsingBreak.java](session_01/src/UsingBreak.java)                         | Loop control using `break`                            | Elementary   |
| 6   | [UsingContinue.java](session_01/src/UsingContinue.java)                   | Loop control using `continue`                         | Elementary   |
| 7   | [ForLoop.java](session_01/src/ForLoop.java)                               | Factorial calculation using `for` loop                | Intermediate |
| 8   | [MaxOfThreeNumbers.java](session_01/src/MaxOfThreeNumbers.java)           | Nested ternary operator to find max of three          | Intermediate |
| 9   | [Calculator.java](session_01/src/Calculator.java)                         | Menu-driven app using `switch-case` + `do-while` loop | Advanced     |

---

## Session 02 — Object-Oriented Programming

**Path:** `session_02/src/`

> Ordered from beginner to advanced.

| #   | File                                                                                    | Description                                                      | Level        |
| --- | --------------------------------------------------------------------------------------- | ---------------------------------------------------------------- | ------------ |
| 1   | [ConstructorDemo.java](session_02/src/ConstructorDemo.java)                             | Default and parameterized constructors with `toString`           | Beginner     |
| 2   | [AccessorAndMutator.java](session_02/src/AccessorAndMutator.java)                       | Getters and setters (accessor/mutator methods)                   | Elementary   |
| 3   | [MyDate.java](session_02/src/MyDate.java)                                               | Class with `init` method and basic field validation              | Elementary   |
| 4   | [Person.java](session_02/src/Person.java)                                               | Constructor chaining with `this()` + `toString` override         | Intermediate |
| 5   | [ConstructorChaining.java](session_02/src/ConstructorChaining.java)                     | Explicit constructor chaining between constructors               | Intermediate |
| 6   | [MethodOverloading.java](session_02/src/MethodOverloading.java)                         | Method overloading with `int` and `float` parameters             | Intermediate |
| 7   | [MathOperation.java](session_02/src/MathOperation.java)                                 | Encapsulated class with add, multiply, and power methods         | Intermediate |
| 8   | [CalculateArea.java](session_02/src/CalculateArea.java)                                 | OOP `init` / `calculate` / `display` pattern for circle area     | Intermediate |
| 9   | [MyDateUserInput.java](session_02/src/MyDateUserInput.java)                             | OOP with `Scanner` and full input validation                     | Advanced     |
| 10  | [MathOperation2.java](session_02/src/MathOperation2.java)                               | Four overloaded `multiply` methods including `float` and varargs | Advanced     |
| 11  | [MethodOverloadingUsingVarArgs.java](session_02/src/MethodOverloadingUsingVarArgs.java) | Method overloading using varargs for `int` and `double`          | Advanced     |

---

## Session 03 — Arrays, Static & OOP Assignments

**Path:** `session_03/src/`

> Covers static keyword, arrays (1D, 2D, jagged), and OOP-based assignment programs.

### Root-Level Programs

| #   | File                                                                      | Description                                           | Level        |
| --- | ------------------------------------------------------------------------- | ----------------------------------------------------- | ------------ |
| 1   | [LearningStatic.java](session_03/src/LearningStatic.java)                 | Static variable, static block, and static method demo | Intermediate |
| 2   | [JaggedArray.java](session_03/src/JaggedArray.java)                       | Jagged (irregular) 2D array creation and traversal    | Intermediate |
| 3   | [AverageMarksOfStudents.java](session_03/src/AverageMarksOfStudents.java) | Array of student marks with average calculation       | Elementary   |
| 4   | [SwapDates.java](session_03/src/SwapDates.java)                           | Swapping date values using object references          | Intermediate |

### Assignments

| #   | File                                                                              | Description                                                                                      | Level        |
| --- | --------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------ | ------------ |
| 1   | [SumAndAverage.java](session_03/src/assignments/SumAndAverage.java)               | Sum and average of array elements, user input                                                    | Beginner     |
| 2   | [SortArrayInDesc.java](session_03/src/assignments/SortArrayInDesc.java)           | Sort array in descending order                                                                   | Elementary   |
| 3   | [GrossSalary.java](session_03/src/assignments/GrossSalary.java)                   | Calculate gross salary using OOP                                                                 | Elementary   |
| 4   | [ArrayDemo.java](session_03/src/assignments/ArrayDemo.java)                       | Jagged array of 17 elements in 5 rows; user input; sum                                           | Intermediate |
| 5   | [MatrixMultiplication.java](session_03/src/assignments/MatrixMultiplication.java) | 3×3 matrix multiplication with user input                                                        | Intermediate |
| 6   | [MatrixTranspose.java](session_03/src/assignments/MatrixTranspose.java)           | Transpose of any m×n matrix; user provides size and elements                                     | Intermediate |
| 7   | [Employee.java](session_03/src/assignments/Employee.java)                         | Employee class — auto-increment `empNo`, static `totalSalary`, class-level `displayStats()`      | Intermediate |
| 8   | [EmployeeDemo.java](session_03/src/assignments/EmployeeDemo.java)                 | Driver for Employee — user enters n salaries, stats displayed                                    | Intermediate |
| 9   | [Product.java](session_03/src/assignments/Product.java)                           | Product class with `pid`, `price`, `quantity` and parameterized constructor                      | Elementary   |
| 10  | [XYZ.java](session_03/src/assignments/XYZ.java)                                   | Accepts 5 products from user; finds PID of highest-priced product; calculates total amount spent | Advanced     |

---

## Session 06 — File Handling, Exception Handling & Date Formatting

**Path:** `session_06/src/`

> Covers runtime exceptions, assertions, `SimpleDateFormat`, and byte-level file I/O using streams.

### Exception Handling

| #   | File                                                                                     | Description                                                               | Level      |
| --- | ---------------------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ---------- |
| 1   | [NullPointerExceptionCode.java](session_06/src/session_06/NullPointerExceptionCode.java) | Demo of `NullPointerException` caught with `try-catch`                    | Beginner   |
| 2   | [IllegalArgumentExample.java](session_06/src/session_06/IllegalArgumentExample.java)     | Field validation throwing `IllegalArgumentException` with custom messages | Elementary |

### Assertion

| #   | File                                                                  | Description                                                   | Level      |
| --- | --------------------------------------------------------------------- | ------------------------------------------------------------- | ---------- |
| 1   | [AssertDemo.java](session_06/src/classroom/assertion/AssertDemo.java) | Using the `assert` keyword for runtime pre-condition checking | Elementary |

### Date Formatting & Parsing

| #   | File                                                                                       | Description                                                            | Level        |
| --- | ------------------------------------------------------------------------------------------ | ---------------------------------------------------------------------- | ------------ |
| 1   | [DateFormatAndParsing.java](session_06/src/classroom/dateformat/DateFormatAndParsing.java) | Formatting and parsing dates with multiple `SimpleDateFormat` patterns | Intermediate |

### File Handling

| #   | File                                                                                                     | Description                                                             | Level        |
| --- | -------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------- | ------------ |
| 1   | [CountNoOfA.java](session_06/src/classroom/filehandling/CountNoOfA.java)                                 | Count occurrences of `'a'`/`'A'` in a file using `FileInputStream`      | Elementary   |
| 2   | [CountNumberOfWords.java](session_06/src/classroom/filehandling/CountNumberOfWords.java)                 | Word count by counting spaces (first-attempt approach, noted incorrect) | Elementary   |
| 3   | [WordCount.java](session_06/src/classroom/filehandling/WordCount.java)                                   | Accurate word count using `Scanner` over a `File` object                | Intermediate |
| 4   | [ReadAndWriteFromFileStream.java](session_06/src/classroom/filehandling/ReadAndWriteFromFileStream.java) | Read from a source file and append-write to a destination file          | Intermediate |

---

## Session 07 — Inner Classes, Lambda Expressions & String Methods

**Path:** `session_07/src/`

> Covers all four inner-class types, functional interfaces, lambda expressions, and common `String` API methods.

### Inner Classes

| #   | File                                                                                               | Description                                                                         | Level        |
| --- | -------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ------------ |
| 1   | [InterfaceArithmaticCal.java](session_07/src/session_07/InterfaceArithmaticCal.java)               | Functional interface with a single `add` method                                     | Beginner     |
| 2   | [MemberInnerClassDemo.java](session_07/src/session_07/MemberInnerClassDemo.java)                   | Member inner class accessing private fields of the outer class                      | Elementary   |
| 3   | [MemberLocalInnerClassDemo.java](session_07/src/session_07/MemberLocalInnerClassDemo.java)         | Method-local inner class defined and used inside a method body                      | Intermediate |
| 4   | [StaticInnerClassDemo.java](session_07/src/session_07/StaticInnerClassDemo.java)                   | Static nested class — access limited to `static` outer members                      | Intermediate |
| 5   | [AnonymousInnerClassDemo.java](session_07/src/session_07/AnonymousInnerClassDemo.java)             | Anonymous inner class providing an on-the-fly implementation of an interface        | Intermediate |
| 6   | [PracticeMethodLocalInnerClass.java](session_07/src/session_07/PracticeMethodLocalInnerClass.java) | Practice task — accessing all variables across outer class, inner class, and method | Advanced     |

### Lambda Expressions

| #   | File                                                                                          | Description                                                          | Level        |
| --- | --------------------------------------------------------------------------------------------- | -------------------------------------------------------------------- | ------------ |
| 1   | [HelloWorldInterface.java](session_07/src/session_07/lambda/HelloWorldInterface.java)         | `@FunctionalInterface` with a `default` method and a `static` helper | Beginner     |
| 2   | [HelloWorldTraditional.java](session_07/src/session_07/lambda/HelloWorldTraditional.java)     | Traditional class implementing a functional interface                | Beginner     |
| 3   | [HelloWorldLambda.java](session_07/src/session_07/lambda/HelloWorldLambda.java)               | Lambda expression replacing the traditional class implementation     | Elementary   |
| 4   | [IncrementByTenInterface.java](session_07/src/session_07/lambda/IncrementByTenInterface.java) | `@FunctionalInterface` for an integer increment operation            | Elementary   |
| 5   | [IncerementByTenClass.java](session_07/src/session_07/lambda/IncerementByTenClass.java)       | Lambda with a block body for increment-by-10 using user input        | Intermediate |

### String Methods

| #   | File                                                               | Description                                                                             | Level        |
| --- | ------------------------------------------------------------------ | --------------------------------------------------------------------------------------- | ------------ |
| 1   | [StringMethods.java](session_07/src/session_07/StringMethods.java) | Common `String` API — `trim`, `equals`, `compareTo`, `toUpperCase`, `toCharArray`, etc. | Intermediate |

---

## Session 08 — Serialization & ArrayList

**Path:** `session_08/src/session_08/classroom/`

> Covers Java object serialization/deserialization and core ArrayList operations.

### Serialization

| #   | File                                                                                                         | Description                                                       | Level        |
| --- | ------------------------------------------------------------------------------------------------------------ | ----------------------------------------------------------------- | ------------ |
| 1   | [SerializationInterface.java](session_08/src/session_08/classroom/serialization/SerializationInterface.java) | `Serializable` POJO with employee name and age fields             | Elementary   |
| 2   | [SerializationDemo.java](session_08/src/session_08/classroom/serialization/SerializationDemo.java)           | Serializes an object to `employee.ser` using `ObjectOutputStream` | Intermediate |
| 3   | [DeserializeDemo.java](session_08/src/session_08/classroom/serialization/DeserializeDemo.java)               | Deserializes an object from file using `ObjectInputStream`        | Intermediate |

### ArrayList

| #   | File                                                                                   | Description                                                            | Level    |
| --- | -------------------------------------------------------------------------------------- | ---------------------------------------------------------------------- | -------- |
| 1   | [ArrayListDemo.java](session_08/src/session_08/classroom/arraylist/ArrayListDemo.java) | `ArrayList` operations — add, insert at index, `addAll`, and iteration | Beginner |

---

## Session 09 — Vector, Stack & Arrays.asList

**Path:** `session_09/src/session_09/classroom/`

> Covers legacy `Vector` and `Stack` collections and the `Arrays.asList` utility.

### Vector

| #   | File                                                                                              | Description                                                             | Level        |
| --- | ------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------- | ------------ |
| 1   | [VectorDemo.java](session_09/src/session_09/classroom/vector/VectorDemo.java)                     | `Vector<Integer>` — capacity management, iteration, and size operations | Intermediate |
| 2   | [VectorItrEnumeration.java](session_09/src/session_09/classroom/vector/VectorItrEnumeration.java) | Iterating a `Vector` using the legacy `Enumeration` interface           | Intermediate |

### Stack

| #   | File                                                                                   | Description                                                                          | Level        |
| --- | -------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------ | ------------ |
| 1   | [NonGenericStack.java](session_09/src/session_09/classroom/stack/NonGenericStack.java) | Raw `Stack` with mixed types — shows push, pop, and peek on heterogeneous elements   | Beginner     |
| 2   | [GenricStackDemo.java](session_09/src/session_09/classroom/stack/GenricStackDemo.java) | Generic `Stack<Integer>` with user input; demos `pop`, `clone`, `firstElement`, etc. | Intermediate |

### Arrays.asList

| #   | File                                                                                    | Description                                                                           | Level        |
| --- | --------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------ |
| 1   | [ArrayAsListDemo.java](session_09/src/session_09/classroom/aslist/ArrayAsListDemo.java) | Converts an array to a fixed-size `List` via `Arrays.asList`; shows add/remove limits | Intermediate |

---

## Session 10 — Comparable & Comparator

**Path:** `session_10/src/session_10/comparable/`

> Covers custom sorting using `Comparator` with `ArrayList` and `Comparable` with `TreeSet`.

### ArrayList with Comparator

| #   | File                                                                                  | Description                                                                 | Level        |
| --- | ------------------------------------------------------------------------------------- | --------------------------------------------------------------------------- | ------------ |
| 1   | [Employee.java](session_10/src/session_10/comparable/arraylist/Employee.java)         | Employee POJO with `empId`, `empName`, and `empSalary`                      | Beginner     |
| 2   | [MyComparator.java](session_10/src/session_10/comparable/arraylist/MyComparator.java) | `Comparator<Employee>` — sorts employees by `empId` ascending               | Intermediate |
| 3   | [Test.java](session_10/src/session_10/comparable/arraylist/Test.java)                 | Sorts an `ArrayList<Employee>` using `Collections.sort` + custom comparator | Intermediate |

### TreeSet with Comparable

| #   | File                                                                                            | Description                                                                  | Level        |
| --- | ----------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ------------ |
| 1   | [Employee.java](session_10/src/session_10/comparable/treeset/Employee.java)                     | Employee POJO (base class for `EmployeeComparable`)                          | Beginner     |
| 2   | [EmployeeComparable.java](session_10/src/session_10/comparable/treeset/EmployeeComparable.java) | Extends `Employee` and implements `Comparable` — descending order by `empId` | Intermediate |
| 3   | [Test.java](session_10/src/session_10/comparable/treeset/Test.java)                             | `TreeSet<EmployeeComparable>` — auto-sorted insertion via `Comparable`       | Intermediate |

---

## Session 11 — Advanced I/O, Functional Programming & Method References

**Path:** `session_11/src/`

> Covers buffered I/O, the `File` API, `Function` functional interface, all three method-reference types, NIO, regex, and `RandomAccessFile`.

### Root-Level Demos

| #   | File                                                        | Description                                                                  | Level        |
| --- | ----------------------------------------------------------- | ---------------------------------------------------------------------------- | ------------ |
| 1   | [DoubleAndSum.java](session_11/src/DoubleAndSum.java)       | Doubles all elements then sums the even results from a list                  | Beginner     |
| 2   | [FixingNextLine.java](session_11/src/FixingNextLine.java)   | Demonstrates `Scanner` pitfall — calling `nextLine()` after `nextInt()`      | Elementary   |
| 3   | [StringTokenDemo.java](session_11/src/StringTokenDemo.java) | Legacy `StringTokenizer` for delimiter-based parsing (superseded by `split`) | Intermediate |

### Buffered I/O

| #   | File                                                                                                               | Description                                                        | Level        |
| --- | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------ |
| 1   | [DemoBufferedReadAndBufferedWrite.java](session_11/src/com/example/buffered/DemoBufferedReadAndBufferedWrite.java) | Line-by-line file copy using `BufferedReader` and `BufferedWriter` | Intermediate |

### File API

| #   | File                                                     | Description                                                                                          | Level        |
| --- | -------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ------------ |
| 1   | [Demo1.java](session_11/src/com/example/file/Demo1.java) | `File` class — `exists`, `canRead`, `canWrite`, `getName`, `length`, `delete`, `createNewFile`, etc. | Intermediate |

### Functional Interfaces

| #   | File                                                                       | Description                                                                       | Level        |
| --- | -------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | ------------ |
| 1   | [DemoFunction.java](session_11/src/com/example/function/DemoFunction.java) | `Function<T,R>` functional interface with lambdas for string transform and length | Intermediate |

### Method References

| #   | File                                                                                                   | Description                                                                            | Level        |
| --- | ------------------------------------------------------------------------------------------------------ | -------------------------------------------------------------------------------------- | ------------ |
| 1   | [ConstructorRef.java](session_11/src/com/example/methodref/constructor/ConstructorRef.java)            | Constructor references (`ClassName::new`) with `Supplier` and `Function`               | Advanced     |
| 2   | [Employee.java](session_11/src/com/example/methodref/instancemethod/Employee.java)                     | Employee POJO used for instance method reference examples                              | Beginner     |
| 3   | [InstanceMethodDemo.java](session_11/src/com/example/methodref/instancemethod/InstanceMethodDemo.java) | Instance method references with `Comparator.comparing` and method chaining             | Advanced     |
| 4   | [Instructor.java](session_11/src/com/example/methodref/staticref/Instructor.java)                      | Instructor POJO with name, gender, age, courses, and experience fields                 | Elementary   |
| 5   | [InstructorDetails.java](session_11/src/com/example/methodref/staticref/InstructorDetails.java)        | Factory providing a static list of `Instructor` objects                                | Intermediate |
| 6   | [StaticRefDemo.java](session_11/src/com/example/methodref/staticref/StaticRefDemo.java)                | Static method references with `Predicate` to filter instructors by years of experience | Advanced     |

### NIO

| #   | File                                                  | Description                                                             | Level        |
| --- | ----------------------------------------------------- | ----------------------------------------------------------------------- | ------------ |
| 1   | [Demo.java](session_11/src/com/example/nio/Demo.java) | Modern file I/O with `Files.readAllLines` and `Files.write` via `Paths` | Intermediate |

### Regex

| #   | File                                                      | Description                                                          | Level        |
| --- | --------------------------------------------------------- | -------------------------------------------------------------------- | ------------ |
| 1   | [Demo.java](session_11/src/com/example/pattern/Demo.java) | Regex with `String.split` and `Pattern.matches` for various patterns | Intermediate |

### RandomAccessFile

| #   | File                                                  | Description                                                                    | Level    |
| --- | ----------------------------------------------------- | ------------------------------------------------------------------------------ | -------- |
| 1   | [Demo.java](session_11/src/com/example/raf/Demo.java) | `RandomAccessFile` — `seek`, `getFilePointer`, and arbitrary read/write access | Advanced |

---

## Session 12 — Streams API & Functional Data Processing

**Path:** `session_12/src/session_12/com/example/javaapi/`

> Covers Java Streams API for functional-style operations on collections, including filtering, mapping, aggregation, and terminal operations with practical `Employee` data examples.

### Core Classes

| #   | File                                                                                                              | Description                                                           | Level    |
| --- | ----------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------- | -------- |
| 1   | [Employee.java](session_12/src/session_12/com/example/javaapi/Employee.java)                                     | POJO with `empId`, `empName`, and `empSal` fields; getters, setters, and `toString` | Beginner |

### Stream Operations

| #   | File                                                                                                              | Description                                                                                        | Level        |
| --- | ----------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | ------------ |
| 1   | [BasicOperations.java](session_12/src/session_12/com/example/javaapi/BasicOperations.java)                       | Stream creation, `IntStream.of()`, `rangeClosed()`, `range()`; chained `filter→map→reduce`         | Elementary   |
| 2   | [SalaryGreaterThan.java](session_12/src/session_12/com/example/javaapi/SalaryGreaterThan.java)                    | `filter()` + `collect()` with `Collectors.toMap()`; salary filtering using method references       | Intermediate |
| 3   | [Test.java](session_12/src/session_12/com/example/javaapi/Test.java)                                             | Comprehensive demo: `count()`, `filter()`, `map()`, `sorted()`, `min()`, `reduce()`, `Optional<T>` | Intermediate |
