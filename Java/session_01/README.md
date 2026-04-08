# Java Session 01 — Fundamentals

This session introduces the core building blocks of Java programming: program structure, user input, arithmetic operations, conditional logic, and loops.

---

## Table of Contents

1. [HelloWorld](#1-helloworldjava)
2. [Calculator](#2-calculatorjava)
3. [CheckGraterOfTwoNumber](#3-checkgrateroftwonumberjava)
4. [CheckNumberIsOddOrEven](#4-checknumberisoddorevenjava)
5. [ForLoop](#5-forloopjava)
6. [WhileLoop](#6-whileloopjava)
7. [UsingBreak](#7-usingbreakjava)
8. [UsingContinue](#8-usingcontinuejava)
9. [MaxOfThreeNumbers](#9-maxofthreenumbersjava)
10. [Concepts Covered](#concepts-covered)
11. [How to Run](#how-to-run)

---

## 1. `HelloWorld.java`

### Purpose
The classic first program — verifies the Java environment is working and introduces the basic structure of every Java program.

### Concepts
- `public class` declaration
- `main` method as the program entry point
- `System.out.println()` for console output

### Code Walkthrough
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
```

| Keyword | Meaning |
|---|---|
| `public class HelloWorld` | Declares a class; filename must match class name |
| `public static void main(String[] args)` | Entry point Java looks for to start execution |
| `System.out.println(...)` | Prints a line to the console |

### Output
```
Hello
```

---

## 2. `Calculator.java`

### Purpose
A menu-driven calculator that performs addition, subtraction, multiplication, and division. Demonstrates `do-while` loops, `switch-case` statements, and basic input handling.

### Concepts
- `Scanner` for reading user input
- `do-while` loop for repeating a menu
- `switch-case` for branching on a character input
- Division-by-zero guard using `if`

### Code Walkthrough

**Menu loop:**
```java
do {
    // show menu, read choice, perform operation
} while (ans == 'Y' || ans == 'y');
```
A `do-while` is used here because the menu must always display at least once before checking whether the user wants to continue.

**Operation dispatch:**
```java
switch (ch) {
    case 'a': result = num1 + num2; break;
    case 'b': result = num1 - num2; break;
    case 'c': result = num1 * num2; break;
    case 'd':
        if (num2 == 0) {
            System.out.println("Denominator cannot be 0!!!");
        } else {
            result = num1 / num2;
        }
        break;
    case 'e': System.exit(0);
}
```
Each `case` maps a single character to an arithmetic operation. The `break` statement prevents fall-through to the next case.

**Why `do-while` and not `while`?**
A `while` loop checks the condition before the first execution. Since we always want to show the menu at least once, `do-while` is the correct choice.

### Sample Interaction
```
a.Addition   b.Sub   c.Mul   d.Div   e.exit
Enter your choice: a
Enter two numbers:
10
5
The result of addition is: 15
Do you want to continue (Y/N)? N
```

---

## 3. `CheckGraterOfTwoNumber.java`

### Purpose
Reads two integers and prints the greater one. Introduces the **ternary operator** as a concise alternative to `if-else`.

### Concepts
- `Scanner` for integer input
- Ternary operator `? :`

### Code Walkthrough
```java
int result = (num1 > num2) ? num1 : num2;
System.out.println("The Greatest of two number " + num1 + ", " + num2 + " is: " + result);
```

**Ternary operator syntax:**
```
condition ? value_if_true : value_if_false
```
This is equivalent to:
```java
int result;
if (num1 > num2)
    result = num1;
else
    result = num2;
```

### Sample Interaction
```
Enter two numbers: 12 45
The Greatest of two number 12, 45 is: 45
```

---

## 4. `CheckNumberIsOddOrEven.java`

### Purpose
Determines whether a number is odd or even using the modulo operator.

### Concepts
- Modulo operator `%`
- Single-line `if-else`

### Code Walkthrough
```java
if (num1 % 2 == 0)
    System.out.println(num1 + " is Even Number!");
else
    System.out.println(num1 + " is Odd Number");
```

**Why `% 2`?**
The remainder when dividing by 2 is always `0` for even numbers and `1` for odd numbers. This is the standard idiom for parity checks in all C-family languages.

### Sample Interaction
```
Enter a number: 7
7 is Odd Number

Enter a number: 4
4 is Even Number!
```

---

## 5. `ForLoop.java`

### Purpose
Calculates the factorial of a number entered by the user. Demonstrates the `for` loop and the accumulator pattern.

### Concepts
- `for` loop structure: `init; condition; update`
- Accumulator variable (`fact`)
- Integer overflow awareness (values >= 13 exceed `int` range)

### Code Walkthrough
```java
int fact = 1;
for (int i = 1; i <= n; i++) {
    fact *= i;
}
System.out.println("Factorial of number " + n + " is: " + fact);
```

**How the loop works step-by-step (n = 4):**

| Iteration | `i` | `fact = fact * i` |
|---|---|---|
| 1 | 1 | 1 × 1 = 1 |
| 2 | 2 | 1 × 2 = 2 |
| 3 | 3 | 2 × 3 = 6 |
| 4 | 4 | 6 × 4 = 24 |

> **Note:** `int` holds values up to 2,147,483,647. For inputs >= 13, the result silently overflows. Use `long` for larger values.

### Sample Interaction
```
Enter the number: 5
Factorial of number 5 is: 120
```

---

## 6. `WhileLoop.java`

### Purpose
Prints numbers 1 through 9 using a `while` loop. Shows the simplest form of a counted loop and contrasts with the `for` loop in the previous example.

### Concepts
- `while` loop
- Loop variable initialization, condition, and increment

### Code Walkthrough
```java
int i = 1;
while (i < 10) {
    System.out.println(i);
    i++;
}
```

**Structure of a `while` loop:**
```
initialize counter
while (condition is true) {
    do work
    update counter   ← forgetting this causes an infinite loop
}
```

The `for` loop and `while` loop are interchangeable for counted loops. `while` is preferred when the number of iterations is not known in advance.

### Output
```
1
2
3
4
5
6
7
8
9
```

---

## 7. `UsingBreak.java`

### Purpose
Demonstrates the `break` statement, which immediately exits a loop when a condition is met.

### Concepts
- `break` keyword
- Early termination of a loop

### Code Walkthrough
```java
for (int i = 1; i <= num; i++) {
    if (i % 2 == 0) break;
    System.out.println(i);
}
```

**Execution trace (num = 6):**

| `i` | `i % 2 == 0`? | Action |
|---|---|---|
| 1 | No | Print `1` |
| 2 | Yes | `break` — exit loop immediately |

The loop terminates as soon as `i` becomes even. Only odd numbers before the first even number are printed.

**Key takeaway:** `break` does not wait for the loop condition to become false — it exits immediately, regardless of where the loop counter is.

### Sample Interaction
```
Enter a number: 6
1
```

---

## 8. `UsingContinue.java`

### Purpose
Demonstrates the `continue` statement, which skips the rest of the current iteration and jumps to the next one — without exiting the loop entirely.

### Concepts
- `continue` keyword
- Skipping iterations selectively

### Code Walkthrough
```java
for (int i = 0; i < n; i++) {
    if (i % 2 == 0)
        continue;   // skip even numbers
    else
        System.out.println(i);
}
```

**Execution trace (n = 8):**

| `i` | Even? | Action |
|---|---|---|
| 0 | Yes | `continue` — skip |
| 1 | No | Print `1` |
| 2 | Yes | `continue` — skip |
| 3 | No | Print `3` |
| ... | ... | ... |
| 7 | No | Print `7` |

**`break` vs `continue`:**

| Keyword | Effect |
|---|---|
| `break` | Exits the loop entirely |
| `continue` | Skips current iteration, loop keeps running |

### Sample Interaction
```
Enter a max number to print odd series: 10
1
3
5
7
9
```

---

## 9. `MaxOfThreeNumbers.java`

### Purpose
Finds the maximum of three integers using **nested ternary operators** — a compact but more advanced expression style.

### Concepts
- Nested ternary operator
- Comparing three values without `if-else-if`

### Code Walkthrough
```java
int result = (num1 > num2) ? (num1 > num3 ? num1 : num3)
                           : (num2 > num3 ? num2 : num3);
```

**Reading it step by step:**
1. Is `num1 > num2`?
   - Yes → compare `num1` vs `num3`, return the larger
   - No  → compare `num2` vs `num3`, return the larger

**Equivalent `if-else-if` form:**
```java
int result;
if (num1 > num2 && num1 > num3)
    result = num1;
else if (num2 > num3)
    result = num2;
else
    result = num3;
```

Both produce identical output. The ternary form is more concise; the `if-else-if` form is easier to read when first learning.

### Sample Interaction
```
Enter three numbers:
4 19 7
19
```

---

## Concepts Covered

| Concept | Programs |
|---|---|
| Program structure & output | `HelloWorld` |
| User input with `Scanner` | `Calculator`, `CheckGrater...`, `ForLoop`, `UsingBreak`, `UsingContinue`, `MaxOfThreeNumbers` |
| Arithmetic operators (`+`, `-`, `*`, `/`, `%`) | `Calculator`, `CheckNumberIsOddOrEven` |
| Conditional (`if-else`) | `CheckGrater...`, `CheckNumberIsOddOrEven`, `Calculator` |
| Ternary operator (`? :`) | `CheckGrater...`, `MaxOfThreeNumbers` |
| `switch-case` | `Calculator` |
| `for` loop | `ForLoop`, `UsingBreak`, `UsingContinue` |
| `while` loop | `WhileLoop` |
| `do-while` loop | `Calculator` |
| `break` | `UsingBreak`, `Calculator` |
| `continue` | `UsingContinue` |

---

## How to Run

### Prerequisites
- JDK 8 or higher installed
- Terminal / Command Prompt

### Compile & Run (command line)

```bash
# Navigate to the src directory
cd Java/session_01/src

# Compile a single file
javac HelloWorld.java

# Run it
java HelloWorld
```

### Using Eclipse
1. Open Eclipse and select **File > Import > Existing Projects into Workspace**
2. Browse to the `session_01/` directory
3. Select the project and click **Finish**
4. Right-click any `.java` file > **Run As > Java Application**

---

*Part of the PGCP Java Learning Series — Session 01*
