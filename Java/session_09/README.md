# Session 09 — Stack

## Contents

- [Session 09 — Stack](#session-09--stack)
  - [Contents](#contents)
  - [Stack Overview](#stack-overview)
  - [GenericStackDemo — Typed Stack](#genericstackdemo--typed-stack)
  - [NonGenericStack — Mixed-Type Stack](#nongenericstack--mixed-type-stack)

---

## Stack Overview

> `Stack` is a **LIFO** (Last In, First Out) data structure from `java.util`. It extends `Vector`, so it is synchronized and resizable.

```
push →  [ bottom ... top ]  → pop
```

Key characteristics:

- Extends `Vector` — inherits all `Vector` methods (`add`, `firstElement`, `lastElement`, `clone`, etc.).
- `Stack<T>` is generic (type-safe); `Stack<Object>` accepts mixed types.
- Can store `null` values since it's based on `Vector`.
- Prefer `Deque` (`ArrayDeque`) for new code — `Stack` is legacy but still widely used.

---

## GenericStackDemo — Typed Stack

[GenricStackDemo.java](src/session_09/classroom/stack/GenricStackDemo.java)

```java
package session_09.classroom.stack;

import java.util.Scanner;
import java.util.Stack;

public class GenricStackDemo {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>(); // generic stack!
        Scanner sc = new Scanner(System.in);
        int stackSize;
        System.out.print("Enter the size of the stack:");
        stackSize = sc.nextInt();

        for (int i = 0; i < stackSize; i++) {
            System.out.print("Enter the stack element at index " + i + " : ");
            s.add(sc.nextInt());
        }

        System.out.println("After removing element!");
        s.pop();
        System.out.println(s.clone());        // clones and returns vector!
        System.out.println(s.empty());        // true if stack is empty, else false
        System.out.println(s.firstElement()); // bottom of the stack
        System.out.println(s.lastElement());  // top of the stack
        sc.close();
    }
}
```

**Notes:**

- `new Stack<>()` — creates an empty, type-safe stack. `<Integer>` means only `int`/`Integer` values are allowed.
- `s.add(val)` — same as `push()`; appends to the top (end of the underlying Vector).
- `s.pop()` — removes and returns the **top** element. Throws `EmptyStackException` if the stack is empty.
- `s.clone()` — returns a shallow copy of the stack as an `Object` (the underlying type is `Vector`).
- `s.empty()` — returns `true` if the stack has no elements.
- `s.firstElement()` — returns the **bottom** element (index 0), inherited from `Vector`.
- `s.lastElement()` — returns the **top** element (last index), inherited from `Vector`.

**Stack-specific methods at a glance:**

| Method         | Description                                       |
|----------------|---------------------------------------------------|
| `push(val)`    | Pushes element onto the top                       |
| `pop()`        | Removes and returns the top element               |
| `peek()`       | Returns the top element **without** removing it   |
| `empty()`      | Returns `true` if stack has no elements           |
| `search(val)`  | Returns 1-based position from top; `-1` if absent |

**Sample run:**

```
Enter the size of the stack: 4
Enter the stack element at index 0 : 10
Enter the stack element at index 1 : 20
Enter the stack element at index 2 : 30
Enter the stack element at index 3 : 40
After removing element!
[10, 20, 30]   ← clone() after pop() removed 40
false          ← stack is not empty
10             ← firstElement() = bottom
30             ← lastElement()  = top
```

---

## NonGenericStack — Mixed-Type Stack

[NonGenericStack.java](src/session_09/classroom/stack/NonGenericStack.java)

```java
package session_09.classroom.stack;

import java.util.Stack;

public class NonGenericStack {
    public static void main(String[] args) {
        Stack<Object> s = new Stack<>();
        s.add("Hi");
        s.add(2);
        s.add(null);
        System.out.println(s);
    }
}
```

**Output:**

```
[Hi, 2, null]
```

**Notes:**

- `Stack<Object>` — typing as `Object` allows any value: `String`, `int` (autoboxed to `Integer`), or even `null`.
- `null` is a valid element because `Vector` (the parent) permits it.
- `System.out.println(s)` calls `toString()` on the stack, printing all elements in insertion order (bottom → top).
- No type safety — retrieving elements requires explicit casting, which can cause `ClassCastException` at runtime.

**Generic vs Non-Generic:**

| Aspect           | `Stack<Integer>` (generic) | `Stack<Object>` (non-generic) |
|------------------|----------------------------|-------------------------------|
| Type safety      | Compile-time checked       | No compile-time check         |
| Mixed types      | Not allowed                | Allowed                       |
| Casting needed   | No                         | Yes, on retrieval             |
| Runtime risk     | Safe                       | `ClassCastException` possible |
