# Java Session 02 — Practice Programs + Object-Oriented Programming

This session is split into two parts:
- **Part A — Practice Programs:** Core logic exercises (arithmetic, loops, number problems) arranged from simplest to most complex.
- **Part B — OOP Programs:** Object-Oriented Programming concepts from getters/setters up to constructor chaining and variable-argument overloading.

---

## Table of Contents

### Part A — Practice Programs

| # | File | Core Concept | Level |
|---|------|-------------|-------|
| 1 | [SwapNumbers](#1-swapnumbersjava) | Swap two variables using a third | Beginner |
| 2 | [SumAndPercentage](#2-sumandpercentagejava) | Sum of 5 subjects + percentage | Beginner |
| 3 | [LeapYear](#3-leapyearjava) | Leap year check using divisibility rules | Beginner |
| 4 | [MultiplicationTables](#4-multiplicationtablesjava) | Tables from 2 to 5 using nested loops | Beginner |
| 5 | [FibonacciSeries](#5-fibonacciseriesjava) | N-term Fibonacci sequence | Intermediate |
| 6 | [ReverseNumber](#6-reversenumberjava) | Reverse digits of an integer | Intermediate |
| 7 | [PrimeNumbers](#7-primenumbersjava) | Print all primes between 1 and 50 | Intermediate |
| 8 | [PalindromeNumber](#8-palindromenumberjava) | Check if a number reads the same forwards and backwards | Intermediate |
| 9 | [ArmstrongNumber](#9-armstrongnumberjava) | Check Armstrong number using digit-power sum | Advanced |

### Part B — OOP Programs

| # | File | Core Concept | Level |
|---|------|-------------|-------|
| 10 | [AccessorAndMutator](#10-accessorandmutatorjava) | Getters and Setters | Beginner |
| 11 | [MyDate](#11-mydatejava) | Class with validation | Beginner |
| 12 | [ConstructorDemo](#12-constructordemojava) | Default vs Parameterized Constructor | Beginner |
| 13 | [MyDateUserInput](#13-mydateuserinputjava) | User input + improved validation | Beginner |
| 14 | [CalculateArea](#14-calculateareajava) | Multi-method class (init / compute / display) | Intermediate |
| 15 | [MathOperation](#15-mathoperationjava) | Class-based math with `init` pattern | Intermediate |
| 16 | [MethodOverloading](#16-methodoverloadingjava) | Overloaded methods by parameter type | Intermediate |
| 17 | [MathOperation2](#17-mathoperation2java) | Multiple overloads on one method | Intermediate |
| 18 | [ConstructorChaining](#18-constructorchainingjava) | `this()` — calling one constructor from another | Advanced |
| 19 | [Person](#19-personjava) | Constructor chaining with default values | Advanced |
| 20 | [MethodOverloadingUsingVarArgs](#20-methodoverloadingusingvarargsjava) | Variable-argument methods (`int...`) | Advanced |

---

## Part A — Practice Programs

---

## 1. `SwapNumbers.java`

**Level:** Beginner — _Start here._

### What it teaches
How to swap two variables using a temporary third variable — one of the most fundamental programming patterns.

### How it works
```
temp = a   →   a = b   →   b = temp
```
Direct assignment `a = b` would overwrite `a` before saving its value. The `temp` variable holds `a`'s original value so it can be assigned to `b` safely.

### Code
```java
int temp = a;
a = b;
b = temp;
```

### Sample Output
```
Enter first number  : 10
Enter second number : 20

Before Swap: a = 10, b = 20
After Swap : a = 20, b = 10
```

> **Note:** Swapping can also be done without a third variable using arithmetic (`a = a + b; b = a - b; a = a - b`) or XOR, but the third-variable method is the clearest and safest.

---

## 2. `SumAndPercentage.java`

**Level:** Beginner

### What it teaches
Using an array to collect multiple inputs in a loop, then computing sum and percentage — a classic accumulator pattern.

### How it works
```java
int[] marks = new int[5];
for (int i = 0; i < 5; i++) marks[i] = sc.nextInt();

int sum = 0;
for (int mark : marks) sum += mark;          // enhanced for-each loop

double percentage = (sum / 500.0) * 100;     // 500.0 forces floating-point division
```

> **Why `500.0` and not `500`?** Integer division (`sum / 500`) truncates the decimal. Using `500.0` promotes the result to `double`, preserving the fractional part.

### Sample Output
```
Enter marks for 5 subjects:
Subject 1: 85
Subject 2: 90
Subject 3: 78
Subject 4: 92
Subject 5: 88

Total Marks : 433 / 500
Percentage  : 86.6%
```

---

## 3. `LeapYear.java`

**Level:** Beginner

### What it teaches
Multi-condition boolean logic — a real-world example where a single `if` is not enough and the conditions must be combined with `&&` and `||`.

### The Leap Year Rule
A year is a leap year if:
1. Divisible by 4 **AND** not divisible by 100 — e.g. 2024
2. **OR** divisible by 400 — e.g. 2000

```java
boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
```

### Why the rule has two parts
| Year | Div by 4 | Div by 100 | Div by 400 | Leap? |
|------|----------|------------|------------|-------|
| 2024 | Yes | No | No | **Yes** |
| 1900 | Yes | Yes | No | **No** |
| 2000 | Yes | Yes | Yes | **Yes** |

### Sample Output
```
Enter a year: 2024
2024 is a Leap Year.

Enter a year: 1900
1900 is NOT a Leap Year.
```

---

## 4. `MultiplicationTables.java`

**Level:** Beginner

### What it teaches
Nested loops — an outer loop controls which table is printed, and an inner loop generates each row.

### Code
```java
for (int table = 2; table <= 5; table++) {
    for (int i = 1; i <= 10; i++) {
        System.out.println(table + " x " + i + " = " + (table * i));
    }
}
```

### Sample Output
```
--- Table of 2 ---
2 x 1 = 2
2 x 2 = 4
...
--- Table of 3 ---
3 x 1 = 3
...
```

> **No user input needed** — the range (2 to 5) is hardcoded, making this the simplest loop program in the set.

---

## 5. `FibonacciSeries.java`

**Level:** Intermediate

### What it teaches
Sequence generation using two variables that "leapfrog" forward — a classic algorithm that appears in nature, mathematics, and dynamic programming.

### How it works
```java
int a = 0, b = 1;
for (int i = 1; i <= n; i++) {
    System.out.print(a + " ");
    int next = a + b;   // compute next term
    a = b;              // shift: a moves to b's position
    b = next;           // shift: b moves to next position
}
```

**Step-by-step (n = 6):**

| Step | `a` | `b` | Printed |
|------|-----|-----|---------|
| 1 | 0 | 1 | 0 |
| 2 | 1 | 1 | 1 |
| 3 | 1 | 2 | 1 |
| 4 | 2 | 3 | 2 |
| 5 | 3 | 5 | 3 |
| 6 | 5 | 8 | 5 |

### Sample Output
```
How many terms? 8
Fibonacci Series: 0 1 1 2 3 5 8 13
```

---

## 6. `ReverseNumber.java`

**Level:** Intermediate

### What it teaches
Digit extraction using modulo and integer division — the foundation of many number-manipulation algorithms (palindrome, Armstrong, digit sum).

### How it works
```java
while (num != 0) {
    int digit  = num % 10;          // extract last digit
    reversed   = reversed * 10 + digit;  // append to reversed
    num       /= 10;                // remove last digit
}
```

**Step-by-step (num = 1234):**

| `num` | `digit` | `reversed` |
|-------|---------|------------|
| 1234 | 4 | 4 |
| 123 | 3 | 43 |
| 12 | 2 | 432 |
| 1 | 1 | 4321 |

### Sample Output
```
Enter a number: 1234
Original  : 1234
Reversed  : 4321
```

---

## 7. `PrimeNumbers.java`

**Level:** Intermediate

### What it teaches
Nested loops with early exit (`break`) and an optimized divisibility check using `Math.sqrt()` — an important efficiency concept.

### How it works
```java
for (int num = 2; num <= 50; num++) {
    boolean isPrime = true;
    for (int i = 2; i <= Math.sqrt(num); i++) {  // only check up to sqrt
        if (num % i == 0) { isPrime = false; break; }
    }
    if (isPrime) System.out.print(num + " ");
}
```

> **Why `Math.sqrt(num)`?** If `num` has a factor larger than its square root, it must also have one smaller — so checking beyond `sqrt` is redundant. This reduces iterations significantly for large numbers.

### Sample Output
```
Prime numbers between 1 and 50:
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
```

---

## 8. `PalindromeNumber.java`

**Level:** Intermediate

### What it teaches
Reuses the digit-reversal logic from `ReverseNumber` to solve a different problem — checking symmetry. Shows how one algorithm (reverse) enables another (palindrome check).

### How it works
```java
int original = num;
int reversed = 0;
while (num != 0) {
    reversed = reversed * 10 + (num % 10);
    num /= 10;
}
if (original == reversed) // palindrome
```

**Palindrome examples:**

| Number | Reversed | Palindrome? |
|--------|----------|-------------|
| 121 | 121 | Yes |
| 1331 | 1331 | Yes |
| 123 | 321 | No |

### Sample Output
```
Enter a number: 121
121 is a Palindrome.

Enter a number: 123
123 is NOT a Palindrome.
```

---

## 9. `ArmstrongNumber.java`

**Level:** Advanced

### What it teaches
Combines digit extraction, `Math.pow()`, and `String.valueOf()` for digit counting — the most algorithmically complex program in Part A.

### What is an Armstrong Number?
A number where the **sum of each digit raised to the power of the total number of digits** equals the original number.

```
153 → digits: 3 → 1³ + 5³ + 3³ = 1 + 125 + 27 = 153 ✓
9474 → digits: 4 → 9⁴ + 4⁴ + 7⁴ + 4⁴ = 6561 + 256 + 2401 + 256 = 9474 ✓
```

### Code
```java
int digits = String.valueOf(num).length();  // count digits
int sum = 0;
while (num != 0) {
    int digit = num % 10;
    sum += (int) Math.pow(digit, digits);   // digit ^ total_digits
    num /= 10;
}
if (sum == original) // Armstrong
```

**Step-by-step (num = 153):**

| Digit | Power | Result |
|-------|-------|--------|
| 3 | 3 | 27 |
| 5 | 3 | 125 |
| 1 | 3 | 1 |
| **Sum** | | **153** |

### Sample Output
```
Enter a number: 153
153 is an Armstrong number.

Enter a number: 100
100 is NOT an Armstrong number.
```

---

## Part B — OOP Programs

---

## 10. `AccessorAndMutator.java`

**Level:** Beginner — _Start here._

### What it teaches
The accessor (getter) / mutator (setter) pattern — the most fundamental building block of encapsulation in OOP. Instead of reading or writing a field directly, all access goes through controlled methods.

### Code Walkthrough

```java
public class AccessorAndMutator {
    int dd, mm, yy;

    // Accessors — read the value
    public int getDate()  { return dd; }
    public int getMonth() { return mm; }
    public int getYear()  { return yy; }

    // Mutators — write the value
    public int setDate(int day)    { dd = day;   return dd; }
    public int setMonth(int month) { mm = month; return mm; }
    public int setYear(int year)   { yy = year;  return yy; }
}
```

**`main` method:**
```java
AccessorAndMutator obj = new AccessorAndMutator();
int day   = obj.setDate(1);
int month = obj.setMonth(12);
int year  = obj.setYear(2026);
System.out.println(day + "/" + month + "/" + year); // 1/12/2026
```

### Key Concepts
| Term | Meaning |
|------|---------|
| Accessor (getter) | A method that returns the value of a field — `getX()` |
| Mutator (setter) | A method that sets the value of a field — `setX(value)` |
| Why not access fields directly? | Setters can add validation later without changing callers |

### Output
```
1/12/2026
```

---

## 11. `MyDate.java`

**Level:** Beginner

### What it teaches
A complete date class that shows the full object lifecycle: declaring a reference, creating an object with `new`, initializing via a method, and setting values through a validated setter.

### Code Walkthrough

```java
public class MyDate {
    private int dd, mm, yy;   // private — hidden from outside

    public void intiDate() {
        dd = mm = yy = 1;     // reset all fields to 1
    }

    public void setDate(int date, int month, int year) {
        if (date < 31 && date > 1)   dd = date;
        if (month > 1 && month < 12) mm = month;
        if (year > 0)                yy = year;
    }

    public void display() {
        System.out.println("Date=[" + dd + "/" + mm + "/" + yy + "]");
    }
}
```

**`main` execution flow:**
```java
MyDate d = new MyDate();    // d.dd = 0, d.mm = 0, d.yy = 0 (Java defaults)
d.display();                // Date=[0/0/0]

d.intiDate();               // reset to 1/1/1
d.display();                // Date=[1/1/1]

d.setDate(1, 12, 2026);     // set to 1/12/2026
d.display();                // Date=[1/12/2026]
```

### Key Concepts
- `private` fields — direct access from outside the class is blocked
- Reference variable: `MyDate d;` — declares a variable that can point to a `MyDate` object
- Object creation: `d = new MyDate();` — allocates memory and returns a reference
- Validation inside `setDate` silently ignores out-of-range values

---

## 12. `ConstructorDemo.java`

**Level:** Beginner

### What it teaches
The difference between a **default constructor** (no arguments, sets fixed values) and a **parameterized constructor** (caller supplies all values). Also introduces `toString()` override for clean object printing.

### Code Walkthrough

```java
public class ConstructorDemo {
    private int empID;
    private String empName;
    private int empSalary;

    // Default constructor — called when no arguments are given
    public ConstructorDemo() {
        System.out.println("Default Constructor called!");
        empID = 1; empName = "Swayam"; empSalary = 5000000;
    }

    // Parameterized constructor — caller provides all values
    public ConstructorDemo(int id, String name, int salary) {
        System.out.println("Parameterized Constructor called!");
        empID = id; empName = name; empSalary = salary;
    }

    public String toString() {
        return "Employee Details: \n" + empID + ", " + empName + ", " + empSalary;
    }
}
```

**`main` execution:**
```java
ConstructorDemo obj1 = new ConstructorDemo();              // default
ConstructorDemo obj2 = new ConstructorDemo(2, "Jay", 223234); // parameterized
System.out.println(obj1);
System.out.println(obj2);
```

### Output
```
Default Constructor called!
Parameterized Constructor called!
Employee Details:
1, Emp Name: Swayam, Emp Salary: 5000000

Employee Details:
2, Emp Name: Jay, Emp Salary: 223234
```

### Key Concepts
| Concept | Details |
|---------|---------|
| Default constructor | No parameters; sets hardcoded initial values |
| Parameterized constructor | Parameters passed at object creation |
| `toString()` override | Called automatically by `System.out.println(obj)` |
| Constructor overloading | Same class, multiple constructors with different signatures |

---

## 13. `MyDateUserInput.java`

**Level:** Beginner

### What it teaches
An improved version of `MyDate` that reads date, month, and year from the user via `Scanner` and prints explicit error messages when a value is out of range — proper boundary validation.

### Code Walkthrough

```java
public void setDate(int date, int month, int year) {
    if (date <= 31 && date >= 1)   dd = date;
    else System.out.print("Invalid Date:\t");

    if (month >= 1 && month <= 12) mm = month;
    else System.out.print("Invalid Month:\t");

    if (year > 0) yy = year;
    else System.out.print("Invalid Year:\t");
}
```

**Comparison with `MyDate.java`:**

| Feature | `MyDate` | `MyDateUserInput` |
|---------|----------|------------------|
| Input source | Hardcoded in `main` | `Scanner` from user |
| Invalid input | Silently ignored | Prints error message |
| Date range check | `date < 31 && date > 1` | `date <= 31 && date >= 1` (fixed — allows 1 and 31) |

### Sample Interaction
```
Enter the date: 15
Enter the month: 8
Enter the date: 2025
Date=[15/8/2025]
```

---

## 14. `CalculateArea.java`

**Level:** Intermediate

### What it teaches
Separating a class into three distinct responsibilities — **initialize**, **compute**, **display** — which is the foundation of single-responsibility design. Fields are `private`; the outside world interacts only through methods.

### Code Walkthrough

```java
public class CalculateArea {
    private double radius;
    private double area;
    private double pi = 3.14;

    public void init(double r)       { radius = r; }
    public void calculateArea()      { area = pi * (radius * radius); }
    public void display()            { System.out.println("Area: " + area + "mm^2"); }
}
```

**`main` — strict method call order:**
```java
CalculateArea obj = new CalculateArea();
obj.init(5.0);           // step 1 — set state
obj.calculateArea();     // step 2 — compute
obj.display();           // step 3 — output → Area: 78.5mm^2
```

### Key Concepts
- **Method separation** — each method does exactly one thing
- **Private fields** — `radius` and `area` cannot be modified directly from outside
- Calling `display()` before `calculateArea()` would print `0.0` — order matters

---

## 15. `MathOperation.java`

**Level:** Intermediate

### What it teaches
A class that stores two values via `init()` and exposes separate methods for different operations. Power is calculated manually using a loop to reinforce the concept rather than relying on `Math.pow()`.

### Code Walkthrough

```java
public class MathOperation {
    private double X, Y, R;

    public void init(int X, int Y) { this.X = X; this.Y = Y; }

    public void add()      { R = X + Y; }
    public void multiply() { R = X * Y; }

    public void power() {
        double result = 1;
        for (int i = 1; i <= Y; i++) result *= X;
        R = result;
    }

    public void display() { System.out.println("Result: " + R); }
}
```

**Usage:**
```java
MathOperation obj = new MathOperation();
obj.init(3, 4);
obj.power();    // 3^4 = 81.0
obj.display();  // Result: 81.0
```

### Key Concepts
- `this.X = X` — `this` resolves the name conflict between the parameter and the field
- Only one operation is called per run — the commented-out `add()` and `multiply()` calls show how to switch

---

## 16. `MethodOverloading.java`

**Level:** Intermediate

### What it teaches
The same method name `add` handling different parameter types. The compiler picks the correct version at compile time based on the types of arguments passed.

### Code Walkthrough

```java
public class MethodOverloading {
    public void add(int a, int b) {
        System.out.println("Addition of a+b = " + (a + b));
    }

    public void add(int a, float b) {
        float sum = a + b;
        System.out.println("(float) Sum of a+b = " + sum);
    }
}
```

**`main` — compiler selects the right overload:**
```java
obj.add(5, 3);      // → add(int, int)   → "Addition of a+b = 8"
obj.add(5, 3.5f);   // → add(int, float) → "(float) Sum of a+b = 8.5"
```

### How Java resolves overloads

| Call | Arguments | Method selected |
|------|-----------|----------------|
| `obj.add(5, 3)` | `int, int` | `add(int a, int b)` |
| `obj.add(5, 3.5f)` | `int, float` | `add(int a, float b)` |

Method overloading is resolved **at compile time** — no runtime cost.

---

## 17. `MathOperation2.java`

**Level:** Intermediate

### What it teaches
Four overloaded signatures of `multiply` in a single class — demonstrating how Java differentiates methods by both the number and types of parameters, including a varargs version.

### Code Walkthrough

```java
public class MathOperation2 {
    public void multiply(int num1, int num2)                  { /* 2 ints */ }
    public void multiply(float num1, float num2, float num3)  { /* 3 floats */ }
    public void multiply(int... arr)                          { /* any number of ints */ }
    public void multiply(double num1, int num2)               { /* double + int */ }
}
```

**`main` — all four overloads called:**
```java
obj.multiply(1, 2, 3, 4, 5);       // varargs  → 120
obj.multiply(2.1f, 2.1f, 3.1f);    // 3 floats → ~13.67
obj.multiply(3.145, 2);            // double + int → 6.29
```

### Key Concepts
- `int... arr` (varargs) matches any number of `int` arguments
- When both a varargs and a fixed-parameter overload match, Java prefers the fixed-parameter version
- Overload resolution is **compile-time** — the right method is locked in before the program runs

---

## 18. `ConstructorChaining.java`

**Level:** Advanced

### What it teaches
Using `this()` to call one constructor from another — a technique called **constructor chaining**. It eliminates duplicate initialization code and guarantees a consistent default state.

### Code Walkthrough

```java
public class ConstructorChaining {
    private String playerName;
    private String playerCountry;

    // Default constructor — sets the default country
    ConstructorChaining() {
        playerCountry = "India";
    }

    // Parameterized constructor — chains to the default first
    public ConstructorChaining(String playerName) {
        this();                       // calls ConstructorChaining() first
        this.playerName = playerName; // then sets the name
    }

    public String toString() {
        return "Player Name: " + playerName + ", Country: " + playerCountry;
    }
}
```

**Execution order when `new ConstructorChaining("Rohit Sharma")` is called:**

```
1. this()  → ConstructorChaining()  → playerCountry = "India"
2.          → this.playerName = "Rohit Sharma"
```

### Output
```
Player Details:
Player Name: Rohit Sharma, Country: India
```

### Key Rules
- `this()` must be the **first statement** in the constructor — the compiler enforces this
- Prevents re-writing `playerCountry = "India"` in every constructor

---

## 19. `Person.java`

**Level:** Advanced

### What it teaches
A second constructor chaining example — the default constructor sets a minimum `age` of 18. The parameterized constructor chains to it first (getting the default), then overrides the age with the caller's value.

### Code Walkthrough

```java
public class Person {
    private String name;
    private int age;

    Person() {
        this.age = 18;        // default age
    }

    Person(String name, int age) {
        this();               // inherits age = 18 first
        this.name = name;
        this.age = age;       // then overrides with provided value
    }

    public String toString() {
        return "Name: " + name + ", age: " + age;
    }
}
```

**`main` — both constructors in action:**
```java
Person obj  = new Person();               // age = 18, name = null
Person obj2 = new Person("Swayam", 34);   // age = 34, name = "Swayam"
System.out.println(obj2); // Name: Swayam, age: 34
System.out.println(obj);  // Name: null, age: 18
```

### Comparison with `ConstructorChaining.java`

| | `ConstructorChaining` | `Person` |
|---|---|---|
| Default constructor sets | `playerCountry` | `age` |
| Chained constructor overrides | nothing (adds `playerName`) | `age` |
| Purpose | Provide a default for one field | Set a minimum/default age |

---

## 20. `MethodOverloadingUsingVarArgs.java`

**Level:** Advanced

### What it teaches
Varargs (`int...`, `double...`) — a single method that accepts **any number of arguments** of the same type. Eliminates the need for multiple fixed-parameter overloads.

### Code Walkthrough

```java
public class MethodOverloadingUsingVarArgs {

    // Accepts any number of int arguments
    public int add(int... a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) sum += a[i];
        return sum;
    }

    // Accepts any number of double arguments
    public double add(double... a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) sum += a[i];
        return sum;
    }
}
```

**`main` — passing 17 integers and 5 doubles:**
```java
int    result1 = obj.add(1, 34, 51, 5, 2, 42, 2, 13, 4, 3, 34, 5, 3, 434, 34, 34, 3); // 703
double result2 = obj.add(1.232, 123.422, 23.232, 232.234, 123.00);                      // 503.12
```

### Varargs vs Fixed Parameters

| Approach | Method signatures needed | Flexibility |
|----------|--------------------------|-------------|
| Fixed overloads | One per argument count | Limited |
| Varargs `int...` | One for all counts | Any number of args |

### Key Rules
- `int... a` is internally treated as `int[] a` — you can use `a.length` and index it
- A method can have only **one** varargs parameter, and it must be **last**
- Java prefers a fixed-parameter overload over varargs when both match

---

## Concepts Covered

### Part A — Practice Programs

| Concept | Programs |
|---------|----------|
| Variable swap with temp | `SwapNumbers` |
| Array + accumulator pattern | `SumAndPercentage` |
| Multi-condition boolean logic | `LeapYear` |
| Nested loops | `MultiplicationTables`, `PrimeNumbers` |
| Sequence generation | `FibonacciSeries` |
| Digit extraction (`% 10`, `/ 10`) | `ReverseNumber`, `PalindromeNumber`, `ArmstrongNumber` |
| `Math.sqrt()` optimization | `PrimeNumbers` |
| `Math.pow()` | `ArmstrongNumber` |
| `String.valueOf()` for digit count | `ArmstrongNumber` |
| `break` for early exit | `PrimeNumbers` |

### Part B — OOP Programs

| Concept | Programs |
|---------|----------|
| Getters and setters | `AccessorAndMutator`, `MyDate`, `MyDateUserInput` |
| `private` fields | All OOP programs |
| Object lifecycle (`new`, methods, display) | `MyDate`, `CalculateArea`, `MathOperation` |
| Default constructor | `ConstructorDemo`, `Person` |
| Parameterized constructor | `ConstructorDemo`, `ConstructorChaining`, `Person` |
| Constructor chaining (`this()`) | `ConstructorChaining`, `Person` |
| Method overloading | `MethodOverloading`, `MathOperation2` |
| Varargs (`int...`) | `MethodOverloadingUsingVarArgs`, `MathOperation2` |
| `toString()` override | `ConstructorDemo`, `ConstructorChaining`, `Person` |
| Input validation | `MyDate`, `MyDateUserInput` |
| `this` keyword | `MathOperation`, `ConstructorChaining`, `Person` |

---

## How to Run

### Prerequisites
- JDK 8 or higher

### Command Line
```bash
cd Java/session_02/src
javac FileName.java
java FileName
```

### Eclipse
1. **File > Import > Existing Projects into Workspace**
2. Browse to `session_02/`
3. Right-click any `.java` file > **Run As > Java Application**

---

*Part of the PGCP Java Learning Series — Session 02*
