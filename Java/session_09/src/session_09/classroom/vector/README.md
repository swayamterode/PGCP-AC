# Vector

## Contents

- [Vector](#vector)
  - [Contents](#contents)
  - [Vector Overview](#vector-overview)
  - [VectorDemo — Basic Usage](#vectordemo--basic-usage)
  - [VectorItrEnumeration — Traversal with Enumeration](#vectoritrenumeration--traversal-with-enumeration)

---

## Vector Overview

> `Vector` is a **synchronized**, resizable array from `java.util`. It works like an `ArrayList` but is thread-safe because all methods are synchronized.

Key characteristics:

- Initial capacity is set at construction; doubles when full (default growth factor ×2).
- Part of the original Java 1.0 collections — `Enumeration` predates `Iterator`.
- Prefer `ArrayList` for single-threaded code; use `Vector` when thread safety is needed without external locking.

```
Vector<Integer>  ──add()──▶  [10, 20, 30 ...]
                              capacity auto-grows when full
```

---

## VectorDemo — Basic Usage

[VectorDemo.java](VectorDemo.java)

```java
package session_09.classroom.vector;

import java.util.Scanner;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfVector;
        System.out.print("Enter the size of the vector: ");
        sizeOfVector = sc.nextInt();

        Vector<Integer> vec = new Vector<>(sizeOfVector);
        System.out.println(vec.capacity()); // prints user's input as initial capacity

        for (int i = 0; i < sizeOfVector; i++) {
            System.out.print("Enter the element at index " + i + " : ");
            vec.add(sc.nextInt());
        }

        System.out.println("Elements in vector!");
        for (int itr : vec) {
            System.out.println(itr);
        }

        sc.close();
    }
}
```

**Notes:**

- `new Vector<>(n)` — sets the initial capacity to `n`. Default capacity (no-arg constructor) is `10`.
- `capacity()` — returns the current allocated capacity, **not** the number of elements (`size()`).
- `add(val)` — appends an element; if size exceeds capacity, the vector grows automatically.
- For-each loop works because `Vector` implements `Iterable`.

**Sample run:**

```
Enter the size of the vector: 3
3
Enter the element at index 0 : 10
Enter the element at index 1 : 20
Enter the element at index 2 : 30
Elements in vector!
10
20
30
```

---

## VectorItrEnumeration — Traversal with Enumeration

[VectorItrEnumeration.java](VectorItrEnumeration.java)

```java
package session_09.classroom.vector;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class VectorItrEnumeration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfVector;
        System.out.print("Enter the size of the vector: ");
        sizeOfVector = sc.nextInt();

        Vector<Integer> vec = new Vector<>(sizeOfVector);

        // input from user!
        for (int i = 0; i < sizeOfVector; i++) {
            System.out.print("Enter the element at index " + i + " : ");
            vec.add(sc.nextInt());
        }

        Enumeration<Integer> e = vec.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

        sc.close();
    }
}
```

**Notes:**

- `vec.elements()` — returns an `Enumeration<Integer>`, the legacy way to traverse a `Vector`.
- `hasMoreElements()` — returns `true` if there are more elements (equivalent to `Iterator.hasNext()`).
- `nextElement()` — returns the next element (equivalent to `Iterator.next()`).
- `Enumeration` is read-only — it cannot remove elements during traversal (unlike `Iterator` which has `remove()`).

**Enumeration vs Iterator:**

| Feature            | `Enumeration` (legacy) | `Iterator` (modern) |
| ------------------ | ---------------------- | ------------------- |
| Introduced         | Java 1.0               | Java 1.2            |
| Remove during loop | No                     | Yes (`remove()`)    |
| Works with         | `Vector`, `Hashtable`  | All collections     |
| Method names       | verbose                | concise             |
