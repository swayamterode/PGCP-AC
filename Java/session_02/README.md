# Java Session 02 — Object-Oriented Programming

This session moves from procedural code to **Object-Oriented Programming (OOP)**. Programs are arranged from the simplest concept (getters/setters) up to the most advanced (constructor chaining and variable-argument overloading).

---

## Table of Contents

| # | File | Core Concept | Level |
|---|------|-------------|-------|
| 1 | [AccessorAndMutator](#1-accessorandmutatorjava) | Getters and Setters | Beginner |
| 2 | [MyDate](#2-mydatejava) | Class with validation | Beginner |
| 3 | [ConstructorDemo](#3-constructordemojava) | Default vs Parameterized Constructor | Beginner |
| 4 | [MyDateUserInput](#4-mydateuserinputjava) | User input + improved validation | Beginner |
| 5 | [CalculateArea](#5-calculateareajava) | Multi-method class (init / compute / display) | Intermediate |
| 6 | [MathOperation](#6-mathoperationjava) | Class-based math with `init` pattern | Intermediate |
| 7 | [MethodOverloading](#7-methodoverloadingjava) | Overloaded methods by parameter type | Intermediate |
| 8 | [MathOperation2](#8-mathoperation2java) | Multiple overloads on one method | Intermediate |
| 9 | [ConstructorChaining](#9-constructorchainingjava) | `this()` — calling one constructor from another | Advanced |
| 10 | [Person](#10-personjava) | Constructor chaining with default values | Advanced |
| 11 | [MethodOverloadingUsingVarArgs](#11-methodoverloadingusingvarargsjava) | Variable-argument methods (`int...`) | Advanced |

---

## 1. `AccessorAndMutator.java`

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

## 2. `MyDate.java`

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

## 3. `ConstructorDemo.java`

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

## 4. `MyDateUserInput.java`

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

## 5. `CalculateArea.java`

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

## 6. `MathOperation.java`

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

## 7. `MethodOverloading.java`

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

## 8. `MathOperation2.java`

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

## 9. `ConstructorChaining.java`

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

## 10. `Person.java`

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

## 11. `MethodOverloadingUsingVarArgs.java`

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

| Concept | Programs |
|---------|----------|
| Getters and setters | `AccessorAndMutator`, `MyDate`, `MyDateUserInput` |
| `private` fields | All programs |
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
